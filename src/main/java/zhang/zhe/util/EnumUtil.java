package zhang.zhe.util;

/**
 * Created by zhengzhou on 15-1-13.
 */
public class EnumUtil {

    /**
     * 日期的格式
     */
    public static enum DateType {
        /**
         * YYYY-MM-DD
         */
        DATE {
            public String toString() {
                return "yyyy-MM-dd";
            }
        },
        /**
         * YYYY-MM
         */
        DATE_SHORT {
            public String toString() {
                return "yyyy-MM";
            }
        },
        /**
         * MM-dd
         */
        DATE_MONTHANDDAY {
            public String toString() {
                return "MM-dd";
            }
        },
        /**
         * yyyy-MM-dd HH
         */
        DATE_HOUR24 {
            public String toString() {
                return "yyyy-MM-dd HH";
            }
        },
        /**
         * yyyy-MM-dd HH:mm:ss
         */
        DATE_FULL {
            public String toString() {
                return "yyyy-MM-dd HH:mm:ss";
            }
        },
        /**
         * yyyy/MM/dd
         */
        DATE_2 {
            public String toString() {
                return "yyyy/MM/dd";
            }
        },
        /**
         * yyyy/MM
         */
        DATE_2_SHORT {
            public String toString() {
                return "yyyy/MM";
            }
        },
        /**
         * yyyy/MM/dd HH
         */
        DATE_HOUR24_2 {
            public String toString() {
                return "yyyy/MM/dd HH";
            }
        },
        /**
         * yyyy/MM/dd HH:mm
         */
        DATE_HOUR24_MIN_2 {
            public String toString() {
                return "yyyy/MM/dd HH:mm";
            }
        },
        /**
         * yyyy/MM/dd HH:mm:ss
         */
        DATE_FULL_2 {
            public String toString() {
                return "yyyy/MM/dd HH:mm:ss";
            }
        },
        /**
         * yyyy年MM月dd日 HH时mm分ss秒
         */
        DATE_FULL_CHINA {
            public String toString() {
                return "yyyy年MM月dd日 HH时mm分ss秒";
            }
        },
        /**
         * yyyy年MM月dd日
         */
        DATE_SIMPLE_CHINA {
            public String toString() {
                return "yyyy年MM月dd日";
            }
        },
        /**
         * EEE MMM dd hh:mm:ss z yyyy
         */
        DATE_GMT {
            public String toString() {
                return "EEE MMM dd hh:mm:ss z yyyy";
            }
        },
        /**
         * HH:mm:ss
         */
        DATE_TIME {
            public String toString() {
                return "HH:mm:ss";
            }
        },

        DATE_MONTH_DAY_2 {
            public String toString(){ return "MM/dd HH:mm";}
        }

    }
}
