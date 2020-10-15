package com.thoughtworks.springbootemployee.mapper;

import com.thoughtworks.springbootemployee.model.Company;
import com.thoughtworks.springbootemployee.model.CompanyRequest;
import com.thoughtworks.springbootemployee.model.CompanyResponse;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {
    public CompanyResponse toResponse(Company company) {
        CompanyResponse response = new CompanyResponse();
        response.setCompanyName(company.getCompanyName());
        response.setEmployeeNumber(company.getEmployeeNumber());
        response.setId(company.getId());
        response.setEmployees(company.getEmployees());
        return null;
    }

    public Company toEntity(CompanyRequest companyRequest) {
        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setEmployeeNumber(companyRequest.getEmployeeNumber());
        return company;
    }
}
