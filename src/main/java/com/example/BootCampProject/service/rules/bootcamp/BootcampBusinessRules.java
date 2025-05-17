package com.example.BootCampProject.service.rules.bootcamp;

import com.example.BootCampProject.core.BootcampState;
import com.example.BootCampProject.core.exceptions.BusinessException;
import com.example.BootCampProject.repository.BootcampRepository;
import com.example.BootCampProject.repository.InstructorRepository;

import java.time.LocalDate;

public class BootcampBusinessRules {
    package com.example.BootCampProject.service.rules.bootcamp;

import com.example.BootCampProject.core.exceptions.BusinessException;
import com.example.BootCampProject.repository.BootcampRepository;
import com.example.BootCampProject.repository.InstructorRepository;
import com.example.BootCampProject.entities.enums.BootcampState;

import java.time.LocalDate;

    public class BootcampBusinessRules {
        private final BootcampRepository bootcampRepository;
        private final InstructorRepository instructorRepository;

        public BootcampBusinessRules(BootcampRepository bootcampRepository, InstructorRepository instructorRepository) {
            this.bootcampRepository = bootcampRepository;
            this.instructorRepository = instructorRepository;
        }

        // 1. Başlangıç tarihi bitiş tarihinden önce olmalıdır
        public void checkIfStartDateBeforeEndDate(LocalDate startDate, LocalDate endDate) {
            if (!startDate.isBefore(endDate)) {
                throw new BusinessException("Başlangıç tarihi, bitiş tarihinden önce olmalıdır.");
            }
        }

        // 2. Aynı isimde bir bootcamp daha önce açılmışsa tekrar açılamaz
        public void checkIfBootcampNameExists(String name) {
            var existingBootcamp = bootcampRepository.findByBootCampName(name);
            if (existingBootcamp != null) {
                throw new BusinessException("Bu isimde bir bootcamp zaten mevcut.");
            }
        }

        // 3. Eğitmen sistemde kayıtlı olmalıdır
        public void checkIfInstructorExists(int instructorId) {
            var instructor = instructorRepository.findById(instructorId);
            if (instructor == null) {
                throw new BusinessException("Belirtilen eğitmen sistemde kayıtlı değil.");
            }
        }

        // 4. Başvuru durumu "CLOSED" olan bootcamp’e başvuru alınamaz
        public void checkIfBootcampOpenForApplication(int bootcampId) {
            var bootcamp = bootcampRepository.findById(bootcampId);
            if (bootcamp == null) {
                throw new BusinessException("Bootcamp bulunamadı.");
            }

            if (bootcamp.getState() == BootcampState.CLOSED) {
                throw new BusinessException("Bu bootcamp başvuruya kapalıdır.");
            }
        }
    }

}
