# Make the Deadfish Swim
<div class="w-full panel bg-ui-section"><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>Write a simple parser that will parse and run Deadfish.  </p>
<p>Deadfish has 4 commands, each 1 character long:</p>
<ul>
<li><code>i</code> increments the value (initially <code>0</code>)</li>
<li><code>d</code> decrements the value</li>
<li><code>s</code> squares the value</li>
<li><code>o</code> outputs the value into the return array</li>
</ul>
<p>Invalid characters should be ignored.</p>

<pre><code class="language-java"><span class="cm-variable">Deadfish</span>.<span class="cm-variable">parse</span>(<span class="cm-string">"iiisdoso"</span>) <span class="cm-operator">=-</span> <span class="cm-keyword">new</span> <span class="cm-type">int</span>[] {<span class="cm-number">8</span>, <span class="cm-number">64</span>};
</code></pre>