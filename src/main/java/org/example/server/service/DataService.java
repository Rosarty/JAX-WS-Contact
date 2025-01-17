package org.example.server.service;


import jakarta.jws.WebMethod;
// Позначає клас Java, який реалізує Web-сервіс.
// або інтерфейс Java як визначальний інтерфейс
// Web-сервісу.
// https://jakarta.ee/specifications/platform/9/apidocs/index.html?jakarta/jws/WebService.html
import jakarta.jws.WebService;
// Задає зіставлення Web-сервісу
// з протоколом повідомлень SOAP.
// https://jakarta.ee/specifications/platform/9/apidocs/jakarta/jws/soap/soapbinding
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface DataService {
    @WebMethod
    String getData(String data);
}
