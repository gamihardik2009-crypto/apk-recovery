package R;

import D.C0032a;
import H.C0103f3;
import H.C0157n1;
import J.C0285q;
import J.C0291t0;
import J.C0294v;
import java.util.ArrayList;
import m2.InterfaceC0861c;
import y2.g;
import y2.h;
import y2.i;
import z2.v;

/* loaded from: classes.dex */
public final class a implements y2.e, y2.f, g, h, i, InterfaceC0861c {

    /* renamed from: h, reason: collision with root package name */
    public final int f5367h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5368i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5369j;

    /* renamed from: k, reason: collision with root package name */
    public C0291t0 f5370k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f5371l;

    public a(int i2, InterfaceC0861c interfaceC0861c, boolean z3) {
        this.f5367h = i2;
        this.f5368i = z3;
        this.f5369j = interfaceC0861c;
    }

    public final Object a(Object obj, C0285q c0285q, int i2) {
        c0285q.W(this.f5367h);
        f(c0285q);
        int a3 = c0285q.g(this) ? b.a(2, 1) : b.a(1, 1);
        Object obj2 = this.f5369j;
        z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        v.d(3, obj2);
        Object i3 = ((y2.f) obj2).i(obj, c0285q, Integer.valueOf(a3 | i2));
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 5, this, obj);
        }
        return i3;
    }

    public final Object b(Object obj, Object obj2, C0285q c0285q, int i2) {
        c0285q.W(this.f5367h);
        f(c0285q);
        int a3 = c0285q.g(this) ? b.a(2, 2) : b.a(1, 2);
        Object obj3 = this.f5369j;
        z2.h.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        v.d(4, obj3);
        Object g3 = ((g) obj3).g(obj, obj2, c0285q, Integer.valueOf(a3 | i2));
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0032a(this, obj, obj2, i2, 1);
        }
        return g3;
    }

    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, C0285q c0285q, int i2) {
        c0285q.W(this.f5367h);
        f(c0285q);
        int a3 = c0285q.g(this) ? b.a(2, 5) : b.a(1, 5);
        Object obj6 = this.f5369j;
        z2.h.d(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        v.d(7, obj6);
        Object h2 = ((i) obj6).h(obj, obj2, obj3, obj4, obj5, c0285q, Integer.valueOf(i2 | a3));
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0103f3(this, obj, obj2, obj3, obj4, obj5, i2, 2);
        }
        return h2;
    }

    public final void f(C0285q c0285q) {
        C0291t0 y3;
        if (!this.f5368i || (y3 = c0285q.y()) == null) {
            return;
        }
        c0285q.getClass();
        y3.f4232a |= 1;
        if (b.d(this.f5370k, y3)) {
            this.f5370k = y3;
            return;
        }
        ArrayList arrayList = this.f5371l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f5371l = arrayList2;
            arrayList2.add(y3);
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (b.d((C0291t0) arrayList.get(i2), y3)) {
                arrayList.set(i2, y3);
                return;
            }
        }
        arrayList.add(y3);
    }

    @Override // y2.g
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (C0285q) obj3, ((Number) obj4).intValue());
    }

    @Override // y2.i
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Integer num) {
        return d(obj, obj2, obj3, obj4, obj5, (C0285q) obj6, num.intValue());
    }

    @Override // y2.f
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3) {
        return a(obj, (C0285q) obj2, ((Number) obj3).intValue());
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        int intValue = ((Number) obj2).intValue();
        c0285q.W(this.f5367h);
        f(c0285q);
        int a3 = intValue | (c0285q.g(this) ? b.a(2, 0) : b.a(1, 0));
        Object obj3 = this.f5369j;
        z2.h.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        v.d(2, obj3);
        Object j3 = ((y2.e) obj3).j(c0285q, Integer.valueOf(a3));
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            v.d(2, this);
            t3.f4235d = this;
        }
        return j3;
    }

    public final void k(InterfaceC0861c interfaceC0861c) {
        if (z2.h.a(this.f5369j, interfaceC0861c)) {
            return;
        }
        boolean z3 = this.f5369j == null;
        this.f5369j = interfaceC0861c;
        if (z3 || !this.f5368i) {
            return;
        }
        C0291t0 c0291t0 = this.f5370k;
        if (c0291t0 != null) {
            C0294v c0294v = c0291t0.f4233b;
            if (c0294v != null) {
                c0294v.q(c0291t0, null);
            }
            this.f5370k = null;
        }
        ArrayList arrayList = this.f5371l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0291t0 c0291t02 = (C0291t0) arrayList.get(i2);
                C0294v c0294v2 = c0291t02.f4233b;
                if (c0294v2 != null) {
                    c0294v2.q(c0291t02, null);
                }
            }
            arrayList.clear();
        }
    }
}
