package mr.li.dance.models;

import mr.li.dance.https.response.BaseResponse;

/**
 * 作者: SuiFeng
 * 版本:
 * 创建日期:2017/8/2 0002
 * 描述:
 * 修订历史:
 */
public class TiXianStateInfo extends BaseResponse {

    /**
     * data : {"start":1,"money":"0.00","time":"2017-08-02 11:59:15"}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * start : 1
         * money : 0.00
         * time : 2017-08-02 11:59:15
         */

        private int start;
        private String money;
        private String time;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
