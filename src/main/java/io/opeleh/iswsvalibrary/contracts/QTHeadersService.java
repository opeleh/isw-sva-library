package io.opeleh.iswsvalibrary.contracts;

public interface QTHeadersService {

    String generateHeaders(String client_id);
    String generateSignature();

}
