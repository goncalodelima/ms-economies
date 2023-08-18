package pt.gongas.economy.api;

import pt.gongas.economy.currency.Currency;
import pt.gongas.economy.currency.type.CurrencyType;

import java.util.List;

public class CurrencyAPI {

    public List<String> getCurrencies() { return CurrencyType.getCurrencies(); }

    public double getAmount(Currency currency) { return currency.getAmount(); }

    public void setAmount(Currency currency, double amount) { currency.setAmount(amount); }

    public void addAmount(Currency currency, double amount) { currency.addAmount(amount); }

    public void removeAmount(Currency currency, double amount) { currency.removeAmount(amount); }

    public String getType(Currency currency) { return currency.getType(); }

}
