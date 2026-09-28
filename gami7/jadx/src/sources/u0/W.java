package u0;

import J2.InterfaceC0328z;
import android.view.Choreographer;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class W extends AbstractC1204i implements y2.e {
    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((W) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new W(2, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        return Choreographer.getInstance();
    }
}
