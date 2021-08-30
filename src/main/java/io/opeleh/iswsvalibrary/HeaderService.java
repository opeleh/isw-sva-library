package io.opeleh.iswsvalibrary;

import io.opeleh.iswsvalibrary.Entities.QTHeaders;
import io.opeleh.iswsvalibrary.contracts.QTHeadersService;
import java.util.Base64;

public class HeaderService implements QTHeadersService {

    private String authorisationHeader;

    private QTHeaders qtHeaders;

    @Override
    public String generateHeaders(String client_id) {
        authorisationHeader = Base64.getEncoder().encodeToString(client_id.getBytes());
        return authorisationHeader;
    }

    @Override
    public String generateSignature() {
        return null;
    }


}
