$(function () {
    var barChart = echarts.init(document.getElementById("echarts-bar-chart"));
    var baroption = {
        title : {
            text: '员工年龄分布图'
        },
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['男性','女性']
        },
        grid:{
            x:30,
            x2:40,
            y2:24
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                data : ['20-25','25-30','30-35','35-40','40-45','45-50','50-55','55-60']
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'男性',
                type:'bar',
                data:[134, 203, 387, 623, 432, 333, 135, 45],
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                },
                markLine : {
                    data : [
                        {type : 'average', name: '平均值'}
                    ]
                }
            },
            {
                name:'女性',
                type:'bar',
                data:[99, 198, 345, 598, 498, 388, 199, 3],
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                },
                markLine : {
                    data : [
                        {type : 'average', name : '平均值'}
                    ]
                }
            }
        ]
    };
    barChart.setOption(baroption);

    window.onresize = barChart.resize;

    var pieChart = echarts.init(document.getElementById("echarts-pie-chart-xueli"));
    var pieoption = {
        title : {
            text: '学历分布',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient : 'vertical',
            x : 'left',
            data:['专科', '本科','硕士','博士']
        },
        calculable : true,
        series : [
            {
                name:'学历分布',
                type:'pie',
                radius : '55%',
                center: ['50%', '60%'],
                label: {
                    show: false,
                },
                data:[
                    {value:335, name:'专科'},
                    {value:1150, name:'本科'},
                    {value:1150, name:'硕士'},
                    {value:230, name:'博士'}
                ]
            }
        ]
    };
    pieChart.setOption(pieoption);
    $(window).resize(pieChart.resize);

    var pieChart = echarts.init(document.getElementById("echarts-pie-chart-xingbie"));
    var pieoption = {
        title : {
            text: '性别分布',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient : 'vertical',
            x : 'left',
            data:['男', '女']
        },
        calculable : true,
        series : [
            {
                name:'性别分布',
                type:'pie',
                radius : '55%',
                center: ['50%', '60%'],
                label: {
                    show: false,
                },
                data:[
                    {value:1485, name:'男'},
                    {value:1380, name:'女'}
                ]
            }
        ]
    };
    pieChart.setOption(pieoption);
    $(window).resize(pieChart.resize);

    var mapChart = echarts.init(document.getElementById("echarts-map-chart"));
    var mapoption = {
        title : {
            text: '员工来源分布',
            subtext: '',
            x:'center'
        },
        tooltip : {
            trigger: 'item'
        },
        legend: {
            orient: 'vertical',
            x:'left',
            data:['男性','女性']
        },
        dataRange: {
            min: 0,
            max: 2500,
            x: 'left',
            y: 'bottom',
            text:['高','低'],           // 文本，默认为数值文本
            calculable : true
        },
        toolbox: {
            show: true,
            orient : 'vertical',
            x: 'right',
            y: 'center',
            feature : {
                mark : {show: true},
                dataView : {show: true, readOnly: false},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        roamController: {
            show: true,
            x: 'right',
            mapTypeControl: {
                'china': true
            }
        },
        series : [
            {
                name: '男性',
                type: 'map',
                mapType: 'china',
                roam: false,
                itemStyle:{
                    normal:{label:{show:true}},
                    emphasis:{label:{show:true}}
                },
                data:[
                    {name: '北京',value: Math.round(Math.random()*500)},
                    {name: '天津',value: Math.round(Math.random()*500)},
                    {name: '上海',value: Math.round(Math.random()*500)},
                    {name: '重庆',value: Math.round(Math.random()*500)},
                    {name: '河北',value: Math.round(Math.random()*500)},
                    {name: '河南',value: Math.round(Math.random()*500)},
                    {name: '云南',value: Math.round(Math.random()*500)},
                    {name: '辽宁',value: Math.round(Math.random()*500)},
                    {name: '黑龙江',value: Math.round(Math.random()*500)},
                    {name: '湖南',value: Math.round(Math.random()*500)},
                    {name: '安徽',value: Math.round(Math.random()*500)},
                    {name: '山东',value: Math.round(Math.random()*500)},
                    {name: '新疆',value: Math.round(Math.random()*500)},
                    {name: '江苏',value: Math.round(Math.random()*500)},
                    {name: '浙江',value: Math.round(Math.random()*500)},
                    {name: '江西',value: Math.round(Math.random()*500)},
                    {name: '湖北',value: Math.round(Math.random()*500)},
                    {name: '广西',value: Math.round(Math.random()*500)},
                    {name: '甘肃',value: Math.round(Math.random()*500)},
                    {name: '山西',value: Math.round(Math.random()*500)},
                    {name: '内蒙古',value: Math.round(Math.random()*500)},
                    {name: '陕西',value: Math.round(Math.random()*500)},
                    {name: '吉林',value: Math.round(Math.random()*500)},
                    {name: '福建',value: Math.round(Math.random()*500)},
                    {name: '贵州',value: Math.round(Math.random()*500)},
                    {name: '广东',value: Math.round(Math.random()*500)},
                    {name: '青海',value: Math.round(Math.random()*500)},
                    {name: '西藏',value: Math.round(Math.random()*500)},
                    {name: '四川',value: Math.round(Math.random()*500)},
                    {name: '宁夏',value: Math.round(Math.random()*500)},
                    {name: '海南',value: Math.round(Math.random()*500)},
                    {name: '台湾',value: Math.round(Math.random()*500)},
                    {name: '香港',value: Math.round(Math.random()*500)},
                    {name: '澳门',value: Math.round(Math.random()*500)}
                ]
            },
            {
                name: '女性',
                type: 'map',
                mapType: 'china',
                itemStyle:{
                    normal:{label:{show:true}},
                    emphasis:{label:{show:true}}
                },
                data:[
                    {name: '北京',value: Math.round(Math.random()*1000)},
                    {name: '天津',value: Math.round(Math.random()*1000)},
                    {name: '上海',value: Math.round(Math.random()*1000)},
                    {name: '重庆',value: Math.round(Math.random()*1000)},
                    {name: '河北',value: Math.round(Math.random()*1000)},
                    {name: '安徽',value: Math.round(Math.random()*1000)},
                    {name: '新疆',value: Math.round(Math.random()*1000)},
                    {name: '浙江',value: Math.round(Math.random()*1000)},
                    {name: '江西',value: Math.round(Math.random()*1000)},
                    {name: '山西',value: Math.round(Math.random()*1000)},
                    {name: '内蒙古',value: Math.round(Math.random()*1000)},
                    {name: '吉林',value: Math.round(Math.random()*1000)},
                    {name: '福建',value: Math.round(Math.random()*1000)},
                    {name: '广东',value: Math.round(Math.random()*1000)},
                    {name: '西藏',value: Math.round(Math.random()*1000)},
                    {name: '四川',value: Math.round(Math.random()*1000)},
                    {name: '宁夏',value: Math.round(Math.random()*1000)},
                    {name: '香港',value: Math.round(Math.random()*1000)},
                    {name: '澳门',value: Math.round(Math.random()*1000)}
                ]
            },

        ]
    };
    mapChart.setOption(mapoption);
    $(window).resize(mapChart.resize);

});
