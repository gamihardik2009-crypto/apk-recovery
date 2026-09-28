package r0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n2.AbstractC0946A;
import t0.C1236E;

/* renamed from: r0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136y implements a0 {

    /* renamed from: h, reason: collision with root package name */
    public O0.k f9904h = O0.k.f5149i;

    /* renamed from: i, reason: collision with root package name */
    public float f9905i;

    /* renamed from: j, reason: collision with root package name */
    public float f9906j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1090D f9907k;

    public C1136y(C1090D c1090d) {
        this.f9907k = c1090d;
    }

    @Override // r0.InterfaceC1126o
    public final boolean F() {
        int i2 = this.f9907k.f9808h.f10379D.f10466c;
        return i2 == 4 || i2 == 2;
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I V(int i2, int i3, Map map, y2.c cVar) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new C1135x(i2, i3, map, this, this.f9907k, cVar);
        }
        AbstractC0946A.r("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // O0.b
    public final float c() {
        return this.f9905i;
    }

    @Override // r0.a0
    public final List f0(Object obj, y2.e eVar) {
        C1090D c1090d = this.f9907k;
        c1090d.e();
        C1236E c1236e = c1090d.f9808h;
        int i2 = c1236e.f10379D.f10466c;
        Object obj2 = null;
        if (!(i2 == 1 || i2 == 3 || i2 == 2 || i2 == 4)) {
            AbstractC0946A.r("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap hashMap = c1090d.f9814n;
        Object obj3 = hashMap.get(obj);
        if (obj3 == null) {
            obj3 = (C1236E) c1090d.q.remove(obj);
            if (obj3 != null) {
                int i3 = c1090d.f9821v;
                if (i3 <= 0) {
                    AbstractC0946A.r("Check failed.");
                    throw null;
                }
                c1090d.f9821v = i3 - 1;
            } else {
                obj3 = c1090d.j(obj);
                if (obj3 == null) {
                    int i4 = c1090d.f9811k;
                    C1236E c1236e2 = new C1236E(2, 0, true);
                    c1236e.f10396r = true;
                    c1236e.x(i4, c1236e2);
                    c1236e.f10396r = false;
                    obj3 = c1236e2;
                }
            }
            hashMap.put(obj, obj3);
        }
        C1236E c1236e3 = (C1236E) obj3;
        List p3 = c1236e.p();
        int i5 = c1090d.f9811k;
        if (i5 >= 0 && i5 < p3.size()) {
            obj2 = p3.get(i5);
        }
        if (obj2 != c1236e3) {
            int indexOf = c1236e.p().indexOf(c1236e3);
            int i6 = c1090d.f9811k;
            if (indexOf < i6) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i6 != indexOf) {
                c1236e.f10396r = true;
                c1236e.H(indexOf, i6, 1);
                c1236e.f10396r = false;
            }
        }
        c1090d.f9811k++;
        c1090d.h(c1236e3, obj, eVar);
        return (i2 == 1 || i2 == 3) ? c1236e3.m() : c1236e3.l();
    }

    @Override // r0.InterfaceC1126o
    public final O0.k getLayoutDirection() {
        return this.f9904h;
    }

    @Override // O0.b
    public final float s() {
        return this.f9906j;
    }
}
