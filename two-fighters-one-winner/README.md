# Two fighters, one winner.
<div class="w-full panel bg-ui-section"><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>Create a function that returns the name of the winner in a fight between two fighters.</p>
<p>Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having <code>health &lt;= 0</code>.</p>
<p>Each fighter will be a <code>Fighter</code> object/instance. See the Fighter class below in your chosen language.</p>
<p>Both <code>health</code> and <code>damagePerAttack</code> (<code>damage_per_attack</code> for python) will be integers larger than <code>0</code>. You can mutate the <code>Fighter</code> objects.</p>
<p>Your function also receives a third argument, a string, with the name of the fighter that attacks first.</p>
<h2 id="example">Example:</h2>
<pre><code>  declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") =&gt; "Lew"

Lew attacks Harry; Harry now has 3 health.
Harry attacks Lew; Lew now has 6 health.
Lew attacks Harry; Harry now has 1 health.
Harry attacks Lew; Lew now has 2 health.
Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
</code></pre>
<h2 id="example">Fighter as Object:</h2>
<pre><code class="language-java"><span class="cm-keyword">public</span> <span class="cm-keyword">class</span> <span class="cm-def">Fighter</span> {
  <span class="cm-keyword">public</span> <span class="cm-type">String</span> <span class="cm-variable">name</span>;
  <span class="cm-keyword">public</span> <span class="cm-type">int</span> <span class="cm-variable">health</span>, <span class="cm-variable">damagePerAttack</span>;
  <span class="cm-keyword">public</span> <span class="cm-variable">Fighter</span>(<span class="cm-type">String</span> <span class="cm-variable">name</span>, <span class="cm-type">int</span> <span class="cm-variable">health</span>, <span class="cm-type">int</span> <span class="cm-variable">damagePerAttack</span>) {
    <span class="cm-keyword">this</span>.<span class="cm-variable">name</span> <span class="cm-operator">=</span> <span class="cm-variable">name</span>;
    <span class="cm-keyword">this</span>.<span class="cm-variable">health</span> <span class="cm-operator">=</span> <span class="cm-variable">health</span>;
    <span class="cm-keyword">this</span>.<span class="cm-variable">damagePerAttack</span> <span class="cm-operator">=</span> <span class="cm-variable">damagePerAttack</span>;
  }
}
</code></pre>