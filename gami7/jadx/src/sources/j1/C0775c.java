package j1;

import C1.y;
import J.C0284p0;
import J2.B;
import M2.InterfaceC0343g;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.I;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775c extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8090l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0472v f8092n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ EnumC0466o f8093o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078i f8094p;
    public final /* synthetic */ InterfaceC0343g q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0775c(C0472v c0472v, EnumC0466o enumC0466o, InterfaceC1078i interfaceC1078i, InterfaceC0343g interfaceC0343g, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8092n = c0472v;
        this.f8093o = enumC0466o;
        this.f8094p = interfaceC1078i;
        this.q = interfaceC0343g;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0775c) m((C0284p0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0775c c0775c = new C0775c(this.f8092n, this.f8093o, this.f8094p, this.q, interfaceC1073d);
        c0775c.f8091m = obj;
        return c0775c;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        Object e3;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8090l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            y.J(obj);
            C0774b c0774b = new C0774b(this.f8094p, this.q, (C0284p0) this.f8091m, null);
            this.f8090l = 1;
            EnumC0466o enumC0466o = EnumC0466o.f6899i;
            EnumC0466o enumC0466o2 = this.f8093o;
            if (enumC0466o2 == enumC0466o) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
            }
            C0472v c0472v = this.f8092n;
            if (c0472v.f6909c == EnumC0466o.f6898h || (e3 = B.e(new I(c0472v, enumC0466o2, c0774b, null), this)) != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return c0880v;
    }
}
