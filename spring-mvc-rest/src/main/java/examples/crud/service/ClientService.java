package examples.crud.service;

import examples.crud.domain.Client;

import java.util.List;
import java.util.Map;

/**
 * Created by serhii on 17.11.14.
 */
public interface ClientService {

    public Client saveOrder(Client client);

    public Client findOrder(int id);

    public void deleteOrder(int id);

    public List<Client> list(int page, int size);

    public List<Client> sortedList(int page, int size, Map<String, String> sort);

    public List<Client> search();
}
