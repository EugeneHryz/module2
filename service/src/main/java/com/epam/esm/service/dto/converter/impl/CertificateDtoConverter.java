package com.epam.esm.service.dto.converter.impl;

import com.epam.esm.repository.entity.GiftCertificate;
import com.epam.esm.service.dto.GiftCertificateDto;
import com.epam.esm.service.dto.converter.AbstractTwoWayConverter;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

@Component
public class CertificateDtoConverter extends AbstractTwoWayConverter<GiftCertificateDto, GiftCertificate> {

    @Override
    protected GiftCertificate convertTo(GiftCertificateDto source) {
        GiftCertificate certificate = new GiftCertificate();
        try {
            BeanUtils.copyProperties(certificate, source);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // ignore
            e.printStackTrace();
        }
        return certificate;
    }

    @Override
    protected GiftCertificateDto convertBack(GiftCertificate source) {
        GiftCertificateDto certificateDto = new GiftCertificateDto();
        try {
            BeanUtils.copyProperties(certificateDto, source);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // ignore
            e.printStackTrace();
        }
        return certificateDto;
    }
}