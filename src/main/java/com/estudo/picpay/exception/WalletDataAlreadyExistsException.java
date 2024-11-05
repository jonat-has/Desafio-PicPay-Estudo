package com.estudo.picpay.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

@Getter
public class WalletDataAlreadyExistsException extends PicPayException {

    private final String detail;

    public WalletDataAlreadyExistsException(String detail) {
        super();
        this.detail = detail;
    }

    @Override
    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);
        pb.setTitle("Wallet data already exists");
        pb.setDetail(detail);
        return pb;
    }
}
