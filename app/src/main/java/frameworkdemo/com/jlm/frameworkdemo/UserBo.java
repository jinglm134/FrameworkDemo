package frameworkdemo.com.jlm.frameworkdemo;

public class UserBo {

    /**
     * token : xxxxxx
     * privateKey : 13212sasd23sa
     * userAccount : 13438872330
     * userID : 4232
     * userName : 何毅
     * userHead : www.baidu.com?hy/123.png
     * identityCard : 510922199110120678
     * customerServiecePhone : 13438872330
     * createDate : 2015-07-07 12:25
     * credibility : 100
     * score : 76
     * baoDouCount : 1000
     * signin : true
     * checkStatus : 2
     * authStatus : 0
     * unreadAnnouCount : 0
     * unreadMessageCount : 0
     * contactPhone : 13438872330
     * officePhone : 400124232
     * mainBrand : 大众
     * businessNature : 厂家
     * businessName : 四川省成都红星汽车
     * address : 四川省成都市双流县学府路1号
     * isVip : true
     * isPushPhoneMessage : true
     * isPushSearchCar : true
     * isPushBlindCar : true
     * haveDoneOderNumber : 0
     * vip : {"amount":10000,"balance":9500,"code":{"amount":3800,"description":"","id":2,"level":1,"name":"保宝买会员"},"day":20,"enabled":1,"endtime":"2015-07-22","id":87,"residualDay":19,"starttime":"2015-07-02","usedDay":1}
     */

    private String token;
    private String privateKey;
    private long userAccount;
    private int userID;
    private String userName;
    private String userHead;
    private String identityCard;
    private String customerServiecePhone;
    private String createDate;
    private int credibility;
    private int score;
    private int baoDouCount;
    private boolean signin;
    private int checkStatus;
    private int authStatus;
    private int unreadAnnouCount;
    private int unreadMessageCount;
    private long contactPhone;
    private String officePhone;
    private String mainBrand;
    private String businessNature;
    private String businessName;
    private String address;
    private boolean isVip;
    private boolean isPushPhoneMessage;
    private boolean isPushSearchCar;
    private boolean isPushBlindCar;
    private int haveDoneOderNumber;
    /**
     * amount : 10000
     * balance : 9500
     * code : {"amount":3800,"description":"","id":2,"level":1,"name":"保宝买会员"}
     * day : 20
     * enabled : 1
     * endtime : 2015-07-22
     * id : 87
     * residualDay : 19
     * starttime : 2015-07-02
     * usedDay : 1
     */

    private VipBean vip;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public long getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(long userAccount) {
        this.userAccount = userAccount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getCustomerServiecePhone() {
        return customerServiecePhone;
    }

    public void setCustomerServiecePhone(String customerServiecePhone) {
        this.customerServiecePhone = customerServiecePhone;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getCredibility() {
        return credibility;
    }

    public void setCredibility(int credibility) {
        this.credibility = credibility;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBaoDouCount() {
        return baoDouCount;
    }

    public void setBaoDouCount(int baoDouCount) {
        this.baoDouCount = baoDouCount;
    }

    public boolean isSignin() {
        return signin;
    }

    public void setSignin(boolean signin) {
        this.signin = signin;
    }

    public int getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(int checkStatus) {
        this.checkStatus = checkStatus;
    }

    public int getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }

    public int getUnreadAnnouCount() {
        return unreadAnnouCount;
    }

    public void setUnreadAnnouCount(int unreadAnnouCount) {
        this.unreadAnnouCount = unreadAnnouCount;
    }

    public int getUnreadMessageCount() {
        return unreadMessageCount;
    }

    public void setUnreadMessageCount(int unreadMessageCount) {
        this.unreadMessageCount = unreadMessageCount;
    }

    public long getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(long contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getMainBrand() {
        return mainBrand;
    }

    public void setMainBrand(String mainBrand) {
        this.mainBrand = mainBrand;
    }

    public String getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsVip() {
        return isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    public boolean isIsPushPhoneMessage() {
        return isPushPhoneMessage;
    }

    public void setIsPushPhoneMessage(boolean isPushPhoneMessage) {
        this.isPushPhoneMessage = isPushPhoneMessage;
    }

    public boolean isIsPushSearchCar() {
        return isPushSearchCar;
    }

    public void setIsPushSearchCar(boolean isPushSearchCar) {
        this.isPushSearchCar = isPushSearchCar;
    }

    public boolean isIsPushBlindCar() {
        return isPushBlindCar;
    }

    public void setIsPushBlindCar(boolean isPushBlindCar) {
        this.isPushBlindCar = isPushBlindCar;
    }

    public int getHaveDoneOderNumber() {
        return haveDoneOderNumber;
    }

    public void setHaveDoneOderNumber(int haveDoneOderNumber) {
        this.haveDoneOderNumber = haveDoneOderNumber;
    }

    public VipBean getVip() {
        return vip;
    }

    public void setVip(VipBean vip) {
        this.vip = vip;
    }

    public static class VipBean {
        private int amount;
        private int balance;
        /**
         * amount : 3800
         * description :
         * id : 2
         * level : 1
         * name : 保宝买会员
         */

        private CodeBean code;
        private int day;
        private int enabled;
        private String endtime;
        private int id;
        private int residualDay;
        private String starttime;
        private int usedDay;

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public CodeBean getCode() {
            return code;
        }

        public void setCode(CodeBean code) {
            this.code = code;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getEnabled() {
            return enabled;
        }

        public void setEnabled(int enabled) {
            this.enabled = enabled;
        }

        public String getEndtime() {
            return endtime;
        }

        public void setEndtime(String endtime) {
            this.endtime = endtime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getResidualDay() {
            return residualDay;
        }

        public void setResidualDay(int residualDay) {
            this.residualDay = residualDay;
        }

        public String getStarttime() {
            return starttime;
        }

        public void setStarttime(String starttime) {
            this.starttime = starttime;
        }

        public int getUsedDay() {
            return usedDay;
        }

        public void setUsedDay(int usedDay) {
            this.usedDay = usedDay;
        }

        public static class CodeBean {
            private int amount;
            private String description;
            private int id;
            private int level;
            private String name;

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    @Override
    public String toString() {
        return "UserBo{" +
                "token='" + token + '\'' +
                ", privateKey='" + privateKey + '\'' +
                ", userAccount=" + userAccount +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userHead='" + userHead + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", customerServiecePhone='" + customerServiecePhone + '\'' +
                ", createDate='" + createDate + '\'' +
                ", credibility=" + credibility +
                ", score=" + score +
                ", baoDouCount=" + baoDouCount +
                ", signin=" + signin +
                ", checkStatus=" + checkStatus +
                ", authStatus=" + authStatus +
                ", unreadAnnouCount=" + unreadAnnouCount +
                ", unreadMessageCount=" + unreadMessageCount +
                ", contactPhone=" + contactPhone +
                ", officePhone='" + officePhone + '\'' +
                ", mainBrand='" + mainBrand + '\'' +
                ", businessNature='" + businessNature + '\'' +
                ", businessName='" + businessName + '\'' +
                ", address='" + address + '\'' +
                ", isVip=" + isVip +
                ", isPushPhoneMessage=" + isPushPhoneMessage +
                ", isPushSearchCar=" + isPushSearchCar +
                ", isPushBlindCar=" + isPushBlindCar +
                ", haveDoneOderNumber=" + haveDoneOderNumber +
                ", vip=" + vip +
                '}';
    }
}
