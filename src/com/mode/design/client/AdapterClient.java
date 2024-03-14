package com.mode.design.client;

import com.mode.design.adapter.ScoreOperation;
import com.mode.design.util.XMLUtil;

import java.beans.XMLDecoder;

/**
 * @author Administrator
 */
public class AdapterClient {

    public static void main(String[] args) {
        //针对抽象目标接口编程
        ScoreOperation scoreOperation ;
        scoreOperation = (ScoreOperation) XMLUtil.getAdapter();
        //定义成绩数组
        int scores[] = {87,86,94,65,73,82,90};
        int result[];
        int score;
        System.out.println("成绩排序结果：");
        result = scoreOperation.sort(scores);

        //遍历输出成绩
        for(int i : scores) {
            System.out.println(i + ",");
        }
        System.out.println();
        System.out.println("查找成绩90：");
        score = scoreOperation.search(scores,90);
        if(score != -1 ) {
            System.out.println("找到成绩90.");
        }else{
            System.out.println("没有找到成绩90.");
        }

    }
}
