package B;

import J2.InterfaceC0328z;
import android.view.View;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import u0.U;

/* renamed from: B.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f207l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f208m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f209n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.c f210o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0007h f211p;
    public final /* synthetic */ B q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005f(U u3, y2.c cVar, C0007h c0007h, B b3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f209n = u3;
        this.f210o = cVar;
        this.f211p = c0007h;
        this.q = b3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((C0005f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0005f c0005f = new C0005f(this.f209n, this.f210o, this.f211p, this.q, interfaceC1073d);
        c0005f.f208m = obj;
        return c0005f;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f207l;
        C0007h c0007h = this.f211p;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
                throw new J2.r();
            }
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f208m;
            D d3 = E.f163a;
            U u3 = this.f209n;
            View view = u3.f10977h;
            d3.getClass();
            z zVar = new z(view);
            G g3 = new G(u3.f10977h, new C0004e(this.q), zVar);
            if (A.e.f15a) {
                J2.B.r(interfaceC0328z, null, 0, new C0003d(c0007h, zVar, null), 3);
            }
            y2.c cVar = this.f210o;
            if (cVar != null) {
                cVar.l(g3);
            }
            c0007h.f219c = g3;
            this.f207l = 1;
            u3.a(g3, this);
            return enumC1145a;
        } catch (Throwable th) {
            c0007h.f219c = null;
            throw th;
        }
    }
}
