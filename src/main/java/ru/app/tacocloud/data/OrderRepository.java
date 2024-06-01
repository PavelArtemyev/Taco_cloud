package ru.app.tacocloud.data;

import ru.app.tacocloud.dto.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
