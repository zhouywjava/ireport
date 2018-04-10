package ireport;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 企业基本信息
 * @Author: zyw
 * @Date: 2018/3/27 14:08
 */
public class EnterPriseCreditBasicInfo implements Serializable {


    private static final long serialVersionUID = 2548003767447876011L;

    private Long id;

    private String orderNo;

    private String name;

    private String orgCode;

    private String registerNo;

    private String artificialName;

    private String artificialName2;

    private String registDate;

    private String handleDate;

    private String cancelDate;

    private String url;

    private String estatus;

    private String estatusName;

    private String ostatus;

    private String ostatusName;

    private String fundCurrency;

    private String registFund;

    private String fundCurrency2;

    private String registFund2;

    private String organType;

    private String economictype;

    private String staffNumber;

    private String tradeCode;

    private String tradeName1;

    private String tradeName2;

    private String tradeName3;

    private String tradeName4;

    private String manageRange;

    private String spcCode;

    private String sqcDesc;

    private String openDate;

    private String manageBeginDate;

    private String manageEndDate;

    private String corpType;

    private String corpTpyeCaption;

    private String allowManageProject;

    private String generalManageProject;

    private String manageRangeFashion;

    private String registerDepartment;

    private String lastCheckYear;

    private String lastCheckDate;

    private String logoutDate;

    private String revokeDate;

    private Date createTime;

    private Integer property;

    public EnterPriseCreditBasicInfo(){
        this.createTime = new Date();
        this.property = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo == null ? null : registerNo.trim();
    }

    public String getArtificialName() {
        return artificialName;
    }

    public void setArtificialName(String artificialName) {
        this.artificialName = artificialName == null ? null : artificialName.trim();
    }

    public String getArtificialName2() {
        return artificialName2;
    }

    public void setArtificialName2(String artificialName2) {
        this.artificialName2 = artificialName2 == null ? null : artificialName2.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getEstatusName() {
        return estatusName;
    }

    public void setEstatusName(String estatusName) {
        this.estatusName = estatusName == null ? null : estatusName.trim();
    }

    public String getOstatusName() {
        return ostatusName;
    }

    public void setOstatusName(String ostatusName) {
        this.ostatusName = ostatusName == null ? null : ostatusName.trim();
    }

    public String getFundCurrency() {
        return fundCurrency;
    }

    public void setFundCurrency(String fundCurrency) {
        this.fundCurrency = fundCurrency == null ? null : fundCurrency.trim();
    }

    public String getFundCurrency2() {
        return fundCurrency2;
    }

    public void setFundCurrency2(String fundCurrency2) {
        this.fundCurrency2 = fundCurrency2 == null ? null : fundCurrency2.trim();
    }

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType == null ? null : organType.trim();
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    public String getTradeName1() {
        return tradeName1;
    }

    public void setTradeName1(String tradeName1) {
        this.tradeName1 = tradeName1 == null ? null : tradeName1.trim();
    }

    public String getTradeName2() {
        return tradeName2;
    }

    public void setTradeName2(String tradeName2) {
        this.tradeName2 = tradeName2 == null ? null : tradeName2.trim();
    }

    public String getTradeName3() {
        return tradeName3;
    }

    public void setTradeName3(String tradeName3) {
        this.tradeName3 = tradeName3 == null ? null : tradeName3.trim();
    }

    public String getTradeName4() {
        return tradeName4;
    }

    public void setTradeName4(String tradeName4) {
        this.tradeName4 = tradeName4 == null ? null : tradeName4.trim();
    }

    public String getManageRange() {
        return manageRange;
    }

    public void setManageRange(String manageRange) {
        this.manageRange = manageRange == null ? null : manageRange.trim();
    }

    public String getSpcCode() {
        return spcCode;
    }

    public void setSpcCode(String spcCode) {
        this.spcCode = spcCode == null ? null : spcCode.trim();
    }

    public String getSqcDesc() {
        return sqcDesc;
    }

    public void setSqcDesc(String sqcDesc) {
        this.sqcDesc = sqcDesc == null ? null : sqcDesc.trim();
    }

    public String getCorpTpyeCaption() {
        return corpTpyeCaption;
    }

    public void setCorpTpyeCaption(String corpTpyeCaption) {
        this.corpTpyeCaption = corpTpyeCaption == null ? null : corpTpyeCaption.trim();
    }

    public String getAllowManageProject() {
        return allowManageProject;
    }

    public void setAllowManageProject(String allowManageProject) {
        this.allowManageProject = allowManageProject == null ? null : allowManageProject.trim();
    }

    public String getGeneralManageProject() {
        return generalManageProject;
    }

    public void setGeneralManageProject(String generalManageProject) {
        this.generalManageProject = generalManageProject == null ? null : generalManageProject.trim();
    }

    public String getManageRangeFashion() {
        return manageRangeFashion;
    }

    public void setManageRangeFashion(String manageRangeFashion) {
        this.manageRangeFashion = manageRangeFashion == null ? null : manageRangeFashion.trim();
    }

    public String getRegisterDepartment() {
        return registerDepartment;
    }

    public void setRegisterDepartment(String registerDepartment) {
        this.registerDepartment = registerDepartment == null ? null : registerDepartment.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    public String getHandleDate() {
        return handleDate;
    }

    public void setHandleDate(String handleDate) {
        this.handleDate = handleDate;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus;
    }

    public String getRegistFund() {
        return registFund;
    }

    public void setRegistFund(String registFund) {
        this.registFund = registFund;
    }

    public String getRegistFund2() {
        return registFund2;
    }

    public void setRegistFund2(String registFund2) {
        this.registFund2 = registFund2;
    }

    public String getEconomictype() {
        return economictype;
    }

    public void setEconomictype(String economictype) {
        this.economictype = economictype;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getManageBeginDate() {
        return manageBeginDate;
    }

    public void setManageBeginDate(String manageBeginDate) {
        this.manageBeginDate = manageBeginDate;
    }

    public String getManageEndDate() {
        return manageEndDate;
    }

    public void setManageEndDate(String manageEndDate) {
        this.manageEndDate = manageEndDate;
    }

    public String getCorpType() {
        return corpType;
    }

    public void setCorpType(String corpType) {
        this.corpType = corpType;
    }

    public String getLastCheckYear() {
        return lastCheckYear;
    }

    public void setLastCheckYear(String lastCheckYear) {
        this.lastCheckYear = lastCheckYear;
    }

    public String getLastCheckDate() {
        return lastCheckDate;
    }

    public void setLastCheckDate(String lastCheckDate) {
        this.lastCheckDate = lastCheckDate;
    }

    public String getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(String logoutDate) {
        this.logoutDate = logoutDate;
    }

    public String getRevokeDate() {
        return revokeDate;
    }

    public void setRevokeDate(String revokeDate) {
        this.revokeDate = revokeDate;
    }
}