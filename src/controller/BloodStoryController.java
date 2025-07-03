package controller;

import dao.BloodStoryDao;
import model.BloodStoryModel;

import java.util.List;

public class BloodStoryController {
    public static List<BloodStoryModel> fetchAllStories() {
        return BloodStoryDao.getAllStories();
    }
}
