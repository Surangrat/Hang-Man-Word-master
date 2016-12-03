package rtc.surangrat.ratchanok.hangmanword;

/**
 * Created by masterUNG on 11/26/2016 AD.
 */

public class MyConstant {

    //Explicit
    private String[] questionStrings, answerString,
            question2Strings, answer2String,
            question3Strings, answer3Strings;

    public String[] getQuestionStrings() {

        questionStrings = new String[]{"1234", "5678", "8765", "4321"};

        return questionStrings;
    }

    public String[] getAnswerStrings() {

        answerString = new String[]{"1234", "5678", "8765", "4321"};

        return answerString;
    }

    public String[] getQuestion2Strings() {

        question2Strings = new String[20];
        question2Strings[0] = "season";
        question2Strings[1] = "banana";
        question2Strings[2] = "yogurt";
        question2Strings[3] = "tennis";
        question2Strings[4] = "search";
        question2Strings[5] = "symbol";
        question2Strings[6] = "boxing";
        question2Strings[7] = "durian";
        question2Strings[8] = "barber";
        question2Strings[9] = "cookie";
        question2Strings[10] = "singer";
        question2Strings[11] = "basket";
        question2Strings[12] = "doctor";
        question2Strings[13] = "pencil";
        question2Strings[14] = "muscle";
        question2Strings[15] = "dinner";
        question2Strings[16] = "school";
        question2Strings[17] = "answer";
        question2Strings[18] = "locker";
        question2Strings[19] = "ticket";

        return question2Strings;
    }

    public String[] getAnswer2Strings() {

        answer2String = new String[20];
        answer2String[0] = "ฤดู";
        answer2String[1] = "กล้อย";
        answer2String[2] = "โยเกิร์ท";
        answer2String[3] = "เทนนิส";
        answer2String[4] = "ค้นหา";
        answer2String[5] = "สัญลักษณ์";
        answer2String[6] = "ชกมวย";
        answer2String[7] = "ทุเรียน";
        answer2String[8] = "ช่างตัดผม";
        answer2String[9] = "คุกกี้";
        answer2String[10] = "นักร้อง";
        answer2String[11] = "ตะกร้า";
        answer2String[12] = "แพทย์";
        answer2String[13] = "ดินสอ";
        answer2String[14] = "กล้ามเนื้อ";
        answer2String[15] = "อาหารเย็น";
        answer2String[16] = "โรงเรียน";
        answer2String[17] = "คำตอบ";
        answer2String[18] = "ล็อกเกอร์";
        answer2String[19] = "ตั๋ว";

        return answer2String;
    }

    public String[] getQuestion3Strings() {
        return question3Strings;
    }

    public String[] getAnswer3Strings() {
        return answer3Strings;
    }
}   // Main Class
