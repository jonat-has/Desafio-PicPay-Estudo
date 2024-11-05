package com.estudo.picpay.service;

import com.estudo.picpay.controller.dto.WalletDTO;
import com.estudo.picpay.entity.Wallet;


import com.estudo.picpay.exception.WalletDataAlreadyExistsException;
import com.estudo.picpay.repository.WalletRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class WalletService {

    final private WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Transactional
    public Wallet createWallet(WalletDTO dto) {

        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.email());

        System.out.println(walletDb);
        if (walletDb.isPresent()) {
            throw new WalletDataAlreadyExistsException("CpfCnpj or Email already exists");
        }


        return walletRepository.save(dto.toWallet());
    }
}
