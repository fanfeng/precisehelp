var router = require('koa-router')();

var ORDER = './view-html/order.jade';
//订单详情页
router.get('/:id',function *(next){
  yield this.render(ORDER);
});

module.exports = router;