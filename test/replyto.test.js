var tape = require('tape');
var replyto = require('../src/replyto');

tape('When no name is provided, function greets "John Doe" as default user', function(assert) {
  assert.strictEqual(replyto.replyTo(), 'hey john doe!');
  assert.end();
});

tape('When a name is provided, function uses that value to provide a greet', function(assert) {
  assert.strictEqual(replyto.replyTo("Tim"), 'hey Tim!');
  assert.end();
});
