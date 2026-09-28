package B1;

import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f251a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.o f252b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f253c;

    public D(UUID uuid, K1.o oVar, Set set) {
        z2.h.f(uuid, "id");
        z2.h.f(oVar, "workSpec");
        z2.h.f(set, "tags");
        this.f251a = uuid;
        this.f252b = oVar;
        this.f253c = set;
    }
}
