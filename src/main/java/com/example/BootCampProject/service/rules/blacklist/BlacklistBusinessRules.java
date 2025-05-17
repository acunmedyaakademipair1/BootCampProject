package com.example.BootCampProject.service.rules.blacklist;

import com.example.BootCampProject.core.exceptions.BusinessException;
import com.example.BootCampProject.repository.BlacklistRepository;

public class BlacklistBusinessRules {
    package com.example.BootCampProject.service.rules.blacklist;

import com.example.BootCampProject.core.exceptions.BusinessException;
import com.example.BootCampProject.repository.BlacklistRepository;

    public class BlacklistBusinessRules {
        private final BlacklistRepository blacklistRepository;

        public BlacklistBusinessRules(BlacklistRepository blacklistRepository) {
            this.blacklistRepository = blacklistRepository;
        }

        // 1. Aynı aday için birden fazla aktif kara liste kaydı olamaz
        public void checkIfApplicantAlreadyBlacklisted(int applicantId) {
            var activeBlacklistEntry = blacklistRepository.findActiveByApplicantId(applicantId);
            if (activeBlacklistEntry != null) {
                throw new BusinessException("Bu aday zaten kara listededir.");
            }
        }

        // 2. Sebep boş bırakılamaz
        public void checkIfReasonIsValid(String reason) {
            if (reason == null || reason.trim().isEmpty()) {
                throw new BusinessException("Kara listeye alma sebebi boş bırakılamaz.");
            }
        }
    }

}
