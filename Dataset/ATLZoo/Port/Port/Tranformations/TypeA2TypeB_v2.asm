<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="TypeA2TypeB"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
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
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
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
		<constant value="__matcher__"/>
		<constant value="A.__matchBlkA2BlkB():V"/>
		<constant value="__exec__"/>
		<constant value="BlkA2BlkB"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyBlkA2BlkB(NTransientLink;):V"/>
		<constant value="__matchBlkA2BlkB"/>
		<constant value="BlockA"/>
		<constant value="TypeA"/>
		<constant value="inA"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="blkA"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="blkB"/>
		<constant value="BlockB"/>
		<constant value="TypeB"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:10-11:22"/>
		<constant value="11:3-14:4"/>
		<constant value="__applyBlkA2BlkB"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="inputPorts"/>
		<constant value="4"/>
		<constant value="J.PortA2InPortB(J):J"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="outputPorts"/>
		<constant value="J.PortA2OutPortB(J):J"/>
		<constant value="12:18-12:22"/>
		<constant value="12:18-12:33"/>
		<constant value="12:47-12:57"/>
		<constant value="12:72-12:73"/>
		<constant value="12:47-12:74"/>
		<constant value="12:18-12:75"/>
		<constant value="12:4-12:75"/>
		<constant value="13:19-13:23"/>
		<constant value="13:19-13:35"/>
		<constant value="13:49-13:59"/>
		<constant value="13:75-13:76"/>
		<constant value="13:49-13:77"/>
		<constant value="13:19-13:78"/>
		<constant value="13:4-13:78"/>
		<constant value="link"/>
		<constant value="PortA2InPortB"/>
		<constant value="MTypeA!PortA;"/>
		<constant value="s"/>
		<constant value="t"/>
		<constant value="InPortB"/>
		<constant value="22:12-22:13"/>
		<constant value="22:12-22:18"/>
		<constant value="22:4-22:18"/>
		<constant value="21:3-23:4"/>
		<constant value="PortA2OutPortB"/>
		<constant value="OutPortB"/>
		<constant value="31:12-31:13"/>
		<constant value="31:12-31:18"/>
		<constant value="31:4-31:18"/>
		<constant value="30:3-32:4"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<call arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<call arg="10"/>
			<call arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<call arg="15"/>
			<getasm/>
			<call arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<call arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<call arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<call arg="51"/>
			<dup/>
			<push arg="52"/>
			<load arg="19"/>
			<call arg="53"/>
			<dup/>
			<push arg="54"/>
			<push arg="55"/>
			<push arg="56"/>
			<new/>
			<call arg="57"/>
			<pusht/>
			<call arg="58"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="59" begin="21" end="23"/>
			<lne id="60" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="52" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="61">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="62"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="52"/>
			<call arg="63"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="64"/>
			<store arg="65"/>
			<load arg="65"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="66"/>
			<iterate/>
			<store arg="67"/>
			<getasm/>
			<load arg="67"/>
			<call arg="68"/>
			<call arg="69"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="66"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="70"/>
			<iterate/>
			<store arg="67"/>
			<getasm/>
			<load arg="67"/>
			<call arg="71"/>
			<call arg="69"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="70"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="72" begin="14" end="14"/>
			<lne id="73" begin="14" end="15"/>
			<lne id="74" begin="18" end="18"/>
			<lne id="75" begin="19" end="19"/>
			<lne id="76" begin="18" end="20"/>
			<lne id="77" begin="11" end="22"/>
			<lne id="78" begin="9" end="24"/>
			<lne id="79" begin="30" end="30"/>
			<lne id="80" begin="30" end="31"/>
			<lne id="81" begin="34" end="34"/>
			<lne id="82" begin="35" end="35"/>
			<lne id="83" begin="34" end="36"/>
			<lne id="84" begin="27" end="38"/>
			<lne id="85" begin="25" end="40"/>
			<lne id="60" begin="8" end="41"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="33" begin="17" end="21"/>
			<lve slot="4" name="33" begin="33" end="37"/>
			<lve slot="3" name="54" begin="7" end="41"/>
			<lve slot="2" name="52" begin="3" end="41"/>
			<lve slot="0" name="17" begin="0" end="41"/>
			<lve slot="1" name="86" begin="0" end="41"/>
		</localvariabletable>
	</operation>
	<operation name="87">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="88"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="87"/>
			<call arg="51"/>
			<dup/>
			<push arg="89"/>
			<load arg="19"/>
			<call arg="53"/>
			<dup/>
			<push arg="90"/>
			<push arg="91"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<call arg="57"/>
			<pushf/>
			<call arg="58"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="92" begin="25" end="25"/>
			<lne id="93" begin="25" end="26"/>
			<lne id="94" begin="23" end="28"/>
			<lne id="95" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="90" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="89" begin="0" end="30"/>
		</localvariabletable>
	</operation>
	<operation name="96">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="88"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="96"/>
			<call arg="51"/>
			<dup/>
			<push arg="89"/>
			<load arg="19"/>
			<call arg="53"/>
			<dup/>
			<push arg="90"/>
			<push arg="97"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<call arg="57"/>
			<pushf/>
			<call arg="58"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="98" begin="25" end="25"/>
			<lne id="99" begin="25" end="26"/>
			<lne id="100" begin="23" end="28"/>
			<lne id="101" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="90" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="89" begin="0" end="30"/>
		</localvariabletable>
	</operation>
</asm>
