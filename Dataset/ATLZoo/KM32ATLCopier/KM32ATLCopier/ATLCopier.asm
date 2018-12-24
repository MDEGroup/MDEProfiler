<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm name="0">
	<cp>
		<constant value="Copy"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J;"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="0"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchCopyTest():V"/>
		<constant value="__matchCopyTest"/>
		<constant value="Test"/>
		<constant value="MM"/>
		<constant value="Sequence"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="CJ.union(CJ):CJ"/>
		<constant value="1"/>
		<constant value="J.oclIsTypeOf(J):J"/>
		<constant value="B.not():B"/>
		<constant value="41"/>
		<constant value="TransientLink"/>
		<constant value="CopyTest"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink(NTransientLink;):V"/>
		<constant value="8:7-8:8"/>
		<constant value="8:21-8:28"/>
		<constant value="8:7-8:29"/>
		<constant value="__resolve__"/>
		<constant value="J"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__exec__"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyCopyTest(NTransientLink;):V"/>
		<constant value="__applyCopyTest"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="description"/>
		<constant value="12:15-12:16"/>
		<constant value="12:15-12:21"/>
		<constant value="12:7-12:21"/>
		<constant value="13:22-13:23"/>
		<constant value="13:22-13:35"/>
		<constant value="13:7-13:35"/>
		<constant value="link"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<load arg="7"/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="10"/>
			<call arg="11"/>
			<dup/>
			<push arg="12"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="13"/>
			<call arg="11"/>
			<call arg="14"/>
			<set arg="3"/>
			<load arg="7"/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<load arg="7"/>
			<call arg="16"/>
			<load arg="7"/>
			<call arg="17"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="19">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<load arg="7"/>
			<call arg="20"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="21">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="22"/>
			<push arg="23"/>
			<findme/>
			<push arg="24"/>
			<push arg="9"/>
			<new/>
			<swap/>
			<dup_x1/>
			<push arg="25"/>
			<call arg="26"/>
			<call arg="27"/>
			<swap/>
			<pop/>
			<iterate/>
			<store arg="28"/>
			<load arg="28"/>
			<push arg="22"/>
			<push arg="23"/>
			<findme/>
			<call arg="29"/>
			<call arg="30"/>
			<if arg="31"/>
			<load arg="7"/>
			<get arg="1"/>
			<push arg="32"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="33"/>
			<call arg="34"/>
			<dup/>
			<push arg="35"/>
			<load arg="28"/>
			<call arg="36"/>
			<dup/>
			<push arg="37"/>
			<push arg="22"/>
			<push arg="23"/>
			<new/>
			<call arg="38"/>
			<call arg="39"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="40" begin="15" end="15"/>
			<lne id="41" begin="16" end="18"/>
			<lne id="42" begin="15" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="41"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
			<parameter name="28" type="44"/>
		</parameters>
		<code>
			<load arg="28"/>
			<load arg="7"/>
			<get arg="3"/>
			<call arg="45"/>
			<if arg="46"/>
			<load arg="7"/>
			<get arg="1"/>
			<load arg="28"/>
			<call arg="47"/>
			<dup/>
			<call arg="48"/>
			<if arg="49"/>
			<load arg="28"/>
			<call arg="50"/>
			<goto arg="51"/>
			<pop/>
			<load arg="28"/>
			<goto arg="52"/>
			<push arg="24"/>
			<push arg="9"/>
			<new/>
			<load arg="28"/>
			<iterate/>
			<store arg="53"/>
			<load arg="7"/>
			<load arg="53"/>
			<call arg="54"/>
			<call arg="55"/>
			<enditerate/>
			<call arg="56"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="57" begin="23" end="27"/>
			<lve slot="0" name="18" begin="0" end="29"/>
			<lve slot="1" name="58" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="59">
		<context type="6"/>
		<parameters>
			<parameter name="28" type="44"/>
			<parameter name="53" type="60"/>
		</parameters>
		<code>
			<load arg="7"/>
			<get arg="1"/>
			<load arg="28"/>
			<call arg="47"/>
			<load arg="28"/>
			<load arg="53"/>
			<call arg="61"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="18" begin="0" end="6"/>
			<lve slot="1" name="58" begin="0" end="6"/>
			<lve slot="2" name="62" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<load arg="7"/>
			<get arg="1"/>
			<push arg="33"/>
			<call arg="64"/>
			<iterate/>
			<store arg="28"/>
			<load arg="7"/>
			<load arg="28"/>
			<call arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="57" begin="5" end="8"/>
			<lve slot="0" name="18" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="66">
		<context type="6"/>
		<parameters>
			<parameter name="28" type="67"/>
		</parameters>
		<code>
			<load arg="28"/>
			<push arg="35"/>
			<call arg="68"/>
			<store arg="53"/>
			<load arg="28"/>
			<push arg="37"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<load arg="7"/>
			<load arg="53"/>
			<get arg="62"/>
			<call arg="54"/>
			<set arg="62"/>
			<dup/>
			<load arg="7"/>
			<load arg="53"/>
			<get arg="71"/>
			<call arg="54"/>
			<set arg="71"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="72" begin="11" end="11"/>
			<lne id="73" begin="11" end="12"/>
			<lne id="74" begin="9" end="14"/>
			<lne id="75" begin="17" end="17"/>
			<lne id="76" begin="17" end="18"/>
			<lne id="77" begin="15" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="35" begin="3" end="21"/>
			<lve slot="3" name="37" begin="7" end="21"/>
			<lve slot="0" name="18" begin="0" end="21"/>
			<lve slot="1" name="78" begin="0" end="21"/>
		</localvariabletable>
	</operation>
</asm>
