package com.estudo.picpay.controller;

import com.estudo.picpay.controller.dto.WalletDTO;
import com.estudo.picpay.entity.Wallet;
import com.estudo.picpay.service.WalletService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    final private WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    public ResponseEntity<Wallet> createWallet(@RequestBody @Valid WalletDTO walletDTO) {

        var newWallet = walletService.createWallet(walletDTO);

        return ResponseEntity.ok(newWallet);
    }
}
