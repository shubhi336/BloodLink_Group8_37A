/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import Dao.DonationHistoryDao;
import java.util.List;
import model.DonationHistoryModel;

public class DonationHistoryController {

    /**
     * Fetch donation history for a given user's email.
     * Only returns completed donations.
     *
     * @param email The email of the logged-in user.
     * @return List of DonationHistoryModel
     */
    public static List<DonationHistoryModel> fetchHistory(String email) {
        return DonationHistoryDao.fetchDonationHistory(email);
    }
}

