package hhxk.pojo

//项目列表信息
data class Item(
    var id: String,
    var img: String,
    var title: String,
    var number: String,
    var type: String,
    var status: String,
    var time: String
)

//工程资料信息
data class ItemData(
    var id: String,
    var img: String,
    var title: String,
    var time: String,
    var kb: String
)

//维修记录
data class Maintenance(
    var id: String,
    var title: String,
    var money: String,
    var time: String,
    var type: String
)

//待审批
data class Pend(
    var id: String,
    var title: String,
    var name: String,
    var time: String,
    var money: String,
    var address: String,
    var type: String=""
)