package com.estudo.picpay.controller.dto;


import com.estudo.picpay.entity.Wallet;
import com.estudo.picpay.entity.WalletType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record WalletDTO(      @NotBlank String name,
                              @NotBlank String cpfCnpj,
                              @NotBlank String email,
                              @NotBlank String password,
                              @NotNull WalletType.Enum walletType) {

    public Wallet toWallet() {
        return new Wallet(
                name,
                cpfCnpj,
                email,
                password,
                walletType.toWalletType()
        );
    }
}