package P1;

import C1.y;
import J2.InterfaceC0328z;
import c.C0556f;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class b extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0556f f5231l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0556f c0556f, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5231l = c0556f;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        b bVar = (b) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        bVar.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new b(this.f5231l, interfaceC1073d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        y.J(obj);
        this.f5231l.R(new String[]{"android.permission.SEND_SMS", "android.permission.READ_PHONE_STATE", "android.permission.RECEIVE_SMS"});
        return C0880v.f8657a;
    }
}
