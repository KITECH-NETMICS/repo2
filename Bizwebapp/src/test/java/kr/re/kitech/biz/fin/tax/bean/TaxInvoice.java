/**
 * 
 */
package kr.re.kitech.biz.fin.tax.bean;

import java.util.List;

/**
 * 
 * @author James
 * @since 2022. 6. 7.
 */

public class TaxInvoice { 
	public ExchangedDocument ExchangedDocument;
	public Signature Signature;
	public TaxInvoiceDocument TaxInvoiceDocument;
	public TaxInvoiceTradeSettlement TaxInvoiceTradeSettlement;
	public TaxInvoiceTradeLineItem TaxInvoiceTradeLineItem;
	public String xmlns;
	public String xsi;
	public String schemaLocation;
	public String text;
}

class ReferencedDocument { 
	public String ID;
}

class ExchangedDocument { 
	public String ID;
	public double IssueDateTime;
	public ReferencedDocument ReferencedDocument;
}

class CanonicalizationMethod { 
	public String Algorithm;
}

class SignatureMethod { 
	public String Algorithm;
}

class Transform { 
	public String Algorithm;
	public String XPath;
	public String text;
}

class Transforms { 
	public List<Transform> Transform;
}

class DigestMethod { 
	public String Algorithm;
}

class Reference { 
	public Transforms Transforms;
	public DigestMethod DigestMethod;
	public String DigestValue;
	public Object URI;
	public String text;
}

class SignedInfo { 
	public CanonicalizationMethod CanonicalizationMethod;
	public SignatureMethod SignatureMethod;
	public Reference Reference;
}

class X509Data { 
	public String X509Certificate;
}

class KeyInfo { 
	public X509Data X509Data;
}

class Signature { 
	public SignedInfo SignedInfo;
	public String SignatureValue;
	public KeyInfo KeyInfo;
	public String ds;
	public String text;
}

class TaxInvoiceDocument { 
	public String IssueID;
	public int TypeCode;
	public int IssueDateTime;
	public int PurposeCode;
}

class SpecifiedPerson { 
	public String NameText;
}

class DefinedContact { 
	public String DepartmentNameText;
	public String PersonNameText;
	public String TelephoneCommunication;
	public String URICommunication;
}

class SpecifiedAddress { 
	public String LineOneText;
}

class InvoicerParty { 
	public int ID;
	public String TypeCode;
	public String NameText;
	public String ClassificationCode;
	public SpecifiedPerson SpecifiedPerson;
	public DefinedContact DefinedContact;
	public SpecifiedAddress SpecifiedAddress;
}

class SpecifiedOrganization { 
	public int BusinessTypeCode;
}

class PrimaryDefinedContact { 
	public String PersonNameText;
	public String URICommunication;
}

class InvoiceeParty { 
	public int ID;
	public String TypeCode;
	public String NameText;
	public String ClassificationCode;
	public SpecifiedOrganization SpecifiedOrganization;
	public SpecifiedPerson SpecifiedPerson;
	public PrimaryDefinedContact PrimaryDefinedContact;
	public SpecifiedAddress SpecifiedAddress;
}

class SpecifiedMonetarySummation { 
	public int ChargeTotalAmount;
	public int TaxTotalAmount;
	public int GrandTotalAmount;
}

class TaxInvoiceTradeSettlement { 
	public InvoicerParty InvoicerParty;
	public InvoiceeParty InvoiceeParty;
	public SpecifiedMonetarySummation SpecifiedMonetarySummation;
}

class TotalTax { 
	public int CalculatedAmount;
}

class TaxInvoiceTradeLineItem { 
	public int SequenceNumeric;
	public int InvoiceAmount;
	public String NameText;
	public int PurchaseExpiryDateTime;
	public TotalTax TotalTax;
}
