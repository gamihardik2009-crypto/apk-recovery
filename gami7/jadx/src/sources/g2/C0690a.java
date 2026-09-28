package g2;

import java.util.List;
import n0.C0933l;
import n2.AbstractC0946A;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import t0.o0;
import t0.p0;
import v.C1337I;
import v.V;
import z2.h;
import z2.i;
import z2.s;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690a extends i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7769i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f7770j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0690a(s sVar, int i2) {
        super(1);
        this.f7769i = i2;
        this.f7770j = sVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f7769i) {
            case 0:
                List list = (List) obj;
                h.f(list, "fields");
                return AbstractC0946A.t(AbstractC0961m.c0((Iterable) this.f7770j.f11909h, list));
            case 1:
                C0933l c0933l = (C0933l) obj;
                s sVar = this.f7770j;
                Object obj2 = sVar.f11909h;
                if (obj2 == null && c0933l.f8952w) {
                    sVar.f11909h = c0933l;
                } else if (obj2 != null && c0933l.f8951v && c0933l.f8952w) {
                    sVar.f11909h = c0933l;
                }
                return Boolean.TRUE;
            case 2:
                C0933l c0933l2 = (C0933l) obj;
                o0 o0Var = o0.f10610h;
                if (!c0933l2.f8952w) {
                    return o0Var;
                }
                this.f7770j.f11909h = c0933l2;
                return c0933l2.f8951v ? o0.f10611i : o0Var;
            case 3:
                C0933l c0933l3 = (C0933l) obj;
                if (c0933l3.f8951v && c0933l3.f8952w) {
                    this.f7770j.f11909h = c0933l3;
                }
                return Boolean.TRUE;
            default:
                p0 p0Var = (p0) obj;
                h.d(p0Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                C1337I c1337i = ((V) p0Var).f11328u;
                s sVar2 = this.f7770j;
                List list2 = (List) sVar2.f11909h;
                if (list2 != null) {
                    list2.add(c1337i);
                } else {
                    list2 = AbstractC0963o.w(c1337i);
                }
                sVar2.f11909h = list2;
                return o0.f10611i;
        }
    }
}
