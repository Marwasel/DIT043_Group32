package facade;

import ItemReviews.ReviewCtrl;
;
import itemStore.ItemCtrl;

import java.util.List;
import java.util.Map;


public class Facade {

    private Facade facade = new Facade();

    public Facade() {

    }

ItemCtrl itemCtrlAccess = new ItemCtrl();
ReviewCtrl reviewCtrlAccess = new ReviewCtrl();



    public String createItem(String itemID, String itemName, double unitPrice){
        return itemCtrlAccess.createItem(itemID, itemName, unitPrice);
    }

    public String printItem(String itemID) {
        return "";
    }

    public String removeItem(String itemID) {
        return "";
    }

    public boolean containsItem(String itemID) {
        return false;
    }

    public double buyItem(String itemID, int amount) {
        return -1.0;
    }
    
    

    
    public String reviewItem(String itemID, String reviewComment, int reviewGrade) {

       return reviewCtrlAccess.reviewItem(itemID, reviewComment, reviewGrade);

    }

    public String reviewItem(String itemID, int reviewGrade) {

        return reviewCtrlAccess.reviewItem(itemID,"", reviewGrade);
    }

    public String getItemCommentsPrinted(String itemID) {

        return reviewCtrlAccess.getItemCommentsPrinted(itemID);
    }

    public List<String> getItemComments(String itemID) {
        return null;
    }


    public double getItemMeanGrade(String itemID) {

        return reviewCtrlAccess.getItemMeanGrade(itemID);
    }
   
    
    
    public int getNumberOfReviews(String itemID) {


        return reviewCtrlAccess.getNumberOfReviews(itemID);
    }

    

    public String getPrintedItemReview(String itemID, int reviewNumber) {

        return reviewCtrlAccess.getPrintedItemReview(itemID,reviewNumber);

    }

    public String getPrintedReviews(String itemID) {
        return reviewCtrlAccess.getPrintedReviews(itemID);
    }

    public String printMostReviewedItems() {

        return reviewCtrlAccess.printMostReviewedItems();
    }

    public List<String> getMostReviewedItems() {

        return reviewCtrlAccess.getMostReviewedItems();
    }

    public List<String> getLeastReviewedItems() {
        return reviewCtrlAccess.getLeastReviewedItems();
    }

    public String printLeastReviewedItems() {
        return reviewCtrlAccess.printLeastReviewedItems();
    }
    
    
    public double getTotalProfit() {
        return -1.0;
    }

    public String printItemTransactions(String itemID) {
        return "";
    }

    public int getTotalUnitsSold() {
        return -1;
    }

    public int getTotalTransactions() {
        return -1;
    }

    public double getProfit(String itemID) {
        return -1.0;
    }

    public int getUnitsSolds(String itemID) {
        return -1;
    }

    public String printAllTransactions() {
        return "";
    }

    public String printWorseReviewedItems() {
        return "";
    }

    public String printBestReviewedItems() {
        return "";
    }

    public List<String> getWorseReviewedItems() {
        return null;
    }

    public List<String> getBestReviewedItems() {
        return null;
    }

    public String printAllReviews() {


        return reviewCtrlAccess.printAllReviews();
    }

    public String updateItemName(String itemID, String newName) {
        return "";
    }

    public String updateItemPrice(String itemID, double newPrice) {
        return "";
    }

    public String printAllItems() {
        return "";
    }

    public String printMostProfitableItems() {
        return "";
    }

    public String createEmployee(String employeeID, String employeeName, double grossSalary) throws Exception {
        return "";
    }

    public String printEmployee(String employeeID) throws Exception {
        return "";
    }

    public String createEmployee(String employeeID, String employeeName, double grossSalary, String degree) throws Exception {
        return "";
    }

    public String createEmployee(String employeeID, String employeeName, double grossSalary, int gpa) throws Exception {
        return "";
    }

    public double getNetSalary(String employeeID) throws Exception {
        return -1.0;
    }

    public String createEmployee(String employeeID, String employeeName, double grossSalary, String degree, String dept) throws Exception {
        return "";
    }

    public String removeEmployee(String empID) throws Exception {
        return "";
    }

    public String printAllEmployees() throws Exception {
        return "";
    }

    public double getTotalNetSalary() throws Exception {
        return -1.0;
    }

    public String printSortedEmployees() throws Exception {
        return "";
    }

    public String updateEmployeeName(String empID, String newName) throws Exception {
        return "";
    }

    public String updateInternGPA(String empID, int newGPA) throws Exception {
        return "";
    }

    public String updateManagerDegree(String empID, String newDegree) throws Exception {
        return "";
    }

    public String updateDirectorDept(String empID, String newDepartment) throws Exception {
        return "";
    }

    public String updateGrossSalary(String empID, double newSalary) throws Exception {
        return "";
    }

    public Map<String, Integer> mapEachDegree() throws Exception {
        return null;
    }

    public String promoteToManager(String empID, String degree) throws Exception {
        return "";

    }

    public String promoteToDirector(String empID, String degree, String department) throws Exception {
        return "";
    }

    public String promoteToIntern(String empID, int gpa) throws Exception {
        return "";
    }
}
