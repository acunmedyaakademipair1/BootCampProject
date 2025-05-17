package com.example.BootCampProject.service.rules.applicant;

import com.example.BootCampProject.core.exceptions.BusinessException;
import com.example.BootCampProject.repository.ApplicantRepository;

public class ApplicantBusinessRules {
    private final ApplicantRepository aapplicantRepository;

    public ApplicantBusinessRules(ApplicantRepository applicantRepository)
    {
        aapplicantRepository = applicantRepository;
    }

    // 1. Aynı TC Kimlik No ile birden fazla başvuru yapılamaz
    public void CheckIfNationalIdExists(int nationalIdentity)
    {
        var existingApplicant = aapplicantRepository.GetByNationalId(nationalIdentity);
        if (existingApplicant != null)
            throw new BusinessException("Bu TC Kimlik No ile zaten bir başvuru yapılmış.");
    }

    // 2. Kara listeye alınan başvuru sahibi yeni başvuru yapamaz
    public void CheckIfBlacklisted(int applicantId)
    {
        var isBlacklisted = aapplicantRepository.IsBlacklisted(applicantId);
        if (isBlacklisted)
            throw new BusinessException("Bu başvuru sahibi kara listededir. Başvuru yapılamaz.");
    }

    // 3. Sistemde kayıtlı olmayan başvuru sahibi ile işlem yapılamaz
    public void CheckIfApplicantExists(int applicantId)
    {
        var applicant = aapplicantRepository.GetById(applicantId);
        if (applicant == null)
            throw new BusinessException("Başvuru sahibi sistemde kayıtlı değil.");
    }
}
