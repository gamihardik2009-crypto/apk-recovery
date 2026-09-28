package n;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900h extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0914w f8785l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900h(C0914w c0914w, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8785l = c0914w;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0900h c0900h = (C0900h) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c0900h.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0900h(this.f8785l, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        C0914w c0914w = this.f8785l;
        r.h hVar = c0914w.f8872H;
        if (hVar != null) {
            r.i iVar = new r.i(hVar);
            r.l lVar = c0914w.f8878w;
            if (lVar != null) {
                J2.B.r(c0914w.y0(), null, 0, new C0894b(lVar, iVar, null), 3);
            }
            c0914w.f8872H = null;
        }
        return C0880v.f8657a;
    }
}
