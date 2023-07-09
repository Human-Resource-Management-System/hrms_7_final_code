package service_interfaces;

import models.HrmsEmploymentOffer;
import models.OfferModel;

public interface OfferLetterServiceInterface {
    void updateEmploymentOfferDocuments(HrmsEmploymentOffer employmentOfferModel, OfferModel of);
}