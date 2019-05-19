package com.home.sunke.homemanager.task;

public class CleanTask extends Task {
    private enum EvaluateLevel{
        GOOD,
        NORMAL,
        NG
    }
    //拖地
    private static final int MOP_THE_FLOOR = 0;
    //扫地
    private static final int SWEEP_THE_FLOOR = 1;
    //洗袜子
    private static final int WASH_THE_SOCKS = 2;
    //擦灰
    private static final int SWEEP_THE_CASH = 3;
    //收衣服
    private static final int COLLECT_THE_CLOTHES = 4;
    //刷马桶
    private static final int WASH_THE_CLOSETOOL = 5;
    //洗鞋子
    private static final int WASH_THE_SHOOES = 6;


}
