package s2;

import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* renamed from: s2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1202g extends AbstractC1196a {
    public AbstractC1202g(InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        if (interfaceC1073d != null && interfaceC1073d.n() != C1079j.f9784h) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return C1079j.f9784h;
    }
}
