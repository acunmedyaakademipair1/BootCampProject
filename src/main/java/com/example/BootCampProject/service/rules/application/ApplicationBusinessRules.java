package com.example.BootCampProject.service.rules.application;

import com.example.BootCampProject.core.exceptions.BusinessException;

public class ApplicationBusinessRules {
    package com.example.BootCampProject.service.rules.application;

import com.example.BootCampProject.core.exceptions.BusinessException;
import com.example.BootCampProject.entities.enums.ApplicationState;
import com.example.BootCampProject.entities.Application;
import com.example.BootCampProject.repository.ApplicationRepository;
import com.example.BootCampProject.repository.ApplicantRepository;
import com.example.BootCampProject.repository.BootcampRepository;

    public class ApplicationBusinessRules {
        private final ApplicationRepository applicationRepository;
        private final ApplicantRepository applicantRepository;
        private final BootcampRepository bootcampRepository;

        public ApplicationBusinessRules(
                ApplicationRepository applicationRepository,
                ApplicantRepository applicantRepository,
                BootcampRepository bootcampRepository
        ) {
            this.applicationRepository = applicationRepository;
            this.applicantRepository = applicantRepository;
            this.bootcampRepository = bootcampRepository;
        }

        // 1. Aynı kişi aynı bootcamp’e birden fazla başvuru yapamaz
        public void checkIfApplicantAlreadyApplied(int applicantId, int bootcampId) {
            var existingApplication = applicationRepository.findByApplicantIdAndBootcampId(applicantId, bootcampId);
            if (existingApplication != null) {
                throw new BusinessException("Bu kişi aynı bootcamp'e zaten başvuru yapmış.");
            }
        }

        // 2. Başvuru yapılan bootcamp aktif olmalıdır
        public void checkIfBootcampIsActive(int bootcampId) {
            var bootcamp = bootcampRepository.findById(bootcampId);
            if (bootcamp == null || bootcamp.getState() != com.example.BootCampProject.entities.enums.BootcampState.OPEN) {
                throw new BusinessException("Başvuru yapılan bootcamp aktif değil.");
            }
        }

        // 3. Kara listeye alınmış bir aday başvuru yapamaz
        public void checkIfApplicantIsBlacklisted(int applicantId) {
            boolean isBlacklisted = applicantRepository.isBlacklisted(applicantId);
            if (isBlacklisted) {
                throw new BusinessException("Kara listedeki bir aday başvuru yapamaz.");
            }
        }

        // 4. Başvurunun durumu sadece belirli statülere geçirilebilir
        public void checkIfApplicationStateChangeIsValid(ApplicationState currentState, ApplicationState newState) {
            // Geçerli durum geçişleri
            switch (currentState) {
                case PENDING:
                    if (newState != ApplicationState.APPROVED && newState != ApplicationState.REJECTED && newState != ApplicationState.CANCELLED) {
                        throw new BusinessException("Geçersiz durum geçişi: PENDING → " + newState);
                    }
                    break;
                case APPROVED:
                case REJECTED:
                case CANCELLED:
                    throw new BusinessException("Bu durumdan başka bir duruma geçiş yapılamaz: " + currentState + " → " + newState);
                default:
                    throw new BusinessException("Bilinmeyen başvuru durumu.");
            }
        }
    }

}
