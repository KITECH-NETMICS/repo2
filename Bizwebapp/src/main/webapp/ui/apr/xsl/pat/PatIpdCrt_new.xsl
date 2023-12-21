<?xml version="1.0"?>
<xsl:stylesheet xmlns:LINS="http://www.inswave.com/LINS" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml" encoding="UTF-8" indent="yes" />
    <xsl:template match="/">
        <html lang="kr">

        <body>
            <table style="width:750px; " border='0' cellspacing='0' cellpadding='0'>
                <tr>
                    <td>
                        <table class="aproutertable" style="width:100%; ">
                            <tr>
                                <td colspan="4" class="head" style="width:100%; ">우선권 주장/분할 선출원 목록</td>
                            </tr>
                            <tr>
                                <td class="body">
                                    <table class="aprinnertable" style="width:100%; ">
                                        <tr>
                                            <td class="title2" style="width:15%; ">신청번호</td>
                                            <td class="title2" style="width:15%; ">관리번호</td>
                                            <td class="title2" style="width:30%; ">발명의명칭</td>
                                            <td class="title2" style="width:10%; ">주발명자</td>
                                            <td class="title2" style="width:15%; ">출원번호</td>
                                            <td class="title2" style="width:15%; ">출원일</td>
                                        </tr>
                                        <xsl:for-each select="root/smipAppLst">
                                            <tr>
                                                <td class="contant">
                                                    <xsl:value-of select="req_no" />
                                                </td>
                                                <td class="contant">
                                                    <xsl:value-of select="mngmt_no" />
                                                </td>
                                                <td class="contant">
                                                    <xsl:value-of select="invnt_krn_nm" />
                                                </td>
                                                <td class="contant">
                                                    <xsl:value-of select="invnt_nm" />
                                                </td>
                                                <td class="contant">
                                                    <xsl:value-of select="smitapp_no" />
                                                </td>
                                                <td class="contant">
                                                    <xsl:value-of select="smitapp_ymd" />
                                                </td>
                                            </tr>
                                        </xsl:for-each>
                                    </table>
                                </td>
                            </tr>
                        </table>
                        <table class="aproutertable" style="width:100%; ">
                            <tr>
                                <td colspan="4" class="head">신청 정보</td>
                            </tr>
                            <tr>
                                <td class="body">
                                    <table class="aprinnertable" style="width:100%; ">
                                        <tr>
                                            <td class="title2" style="width:22%; ">신청구분</td>
                                            <td class="contant" colspan="3" style="width:72%; ">
                                                <xsl:value-of select="root/dp_clsf_nm" />
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="title2">사유</td>
                                            <td class="contant" colspan="3">
                                                <xsl:value-of select="root/dp_resn" />
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class='title2'>첨부파일</td>
                                            <td class='contant' colspan='3'>
                                                <xsl:for-each select="root/attachVo1">
                                                    <a>
                                                        <xsl:attribute name="href">javascript:downloadForXsl('
                                                            <xsl:value-of select="attach_file_no" />
                                                            <xsl:value-of select="seq" />','XAA070')</xsl:attribute>
                                                        <xsl:value-of select="file_nm" />
                                                    </a>
                                                    <xsl:if test="attach_file_no != ''">
                                                    <a>
                                                        <xsl:attribute name="href">javascript:biz.apr.previewFiles('<xsl:value-of select="attach_file_no" />', '<xsl:value-of
                                                            select="seq" />')</xsl:attribute>
                                                        <img src="/cm/images/sch_glass_on.png" alt="미리보기" title="미리보기"
                                                            style="width: 14px; height: 14px; vertical-align: middle; margin-left: 10px;" />
                                                    </a>
                                                </xsl:if>
                                                </xsl:for-each>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </body>

        </html>
    </xsl:template>
</xsl:stylesheet>