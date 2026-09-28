package v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.a0;

/* renamed from: v.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329A implements InterfaceC1096J {

    /* renamed from: h, reason: collision with root package name */
    public final w f11271h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f11272i;

    /* renamed from: j, reason: collision with root package name */
    public final x f11273j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f11274k = new HashMap();

    public C1329A(w wVar, a0 a0Var) {
        this.f11271h = wVar;
        this.f11272i = a0Var;
        this.f11273j = (x) wVar.f11397b.c();
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I C(int i2, int i3, Map map, y2.c cVar) {
        return this.f11272i.C(i2, i3, map, cVar);
    }

    @Override // r0.InterfaceC1126o
    public final boolean F() {
        return this.f11272i.F();
    }

    @Override // O0.b
    public final long G(long j3) {
        return this.f11272i.G(j3);
    }

    @Override // O0.b
    public final long J(float f3) {
        return this.f11272i.J(f3);
    }

    @Override // O0.b
    public final long M(long j3) {
        return this.f11272i.M(j3);
    }

    @Override // O0.b
    public final float P(float f3) {
        return this.f11272i.P(f3);
    }

    @Override // O0.b
    public final float Q(long j3) {
        return this.f11272i.Q(j3);
    }

    @Override // r0.InterfaceC1096J
    public final InterfaceC1095I V(int i2, int i3, Map map, y2.c cVar) {
        return this.f11272i.V(i2, i3, map, cVar);
    }

    public final List a(long j3, int i2) {
        HashMap hashMap = this.f11274k;
        List list = (List) hashMap.get(Integer.valueOf(i2));
        if (list != null) {
            return list;
        }
        x xVar = this.f11273j;
        Object b3 = xVar.b(i2);
        List f02 = this.f11272i.f0(b3, this.f11271h.a(b3, i2, xVar.d(i2)));
        int size = f02.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((InterfaceC1093G) f02.get(i3)).a(j3));
        }
        hashMap.put(Integer.valueOf(i2), arrayList);
        return arrayList;
    }

    @Override // O0.b
    public final float c() {
        return this.f11272i.c();
    }

    @Override // O0.b
    public final long g0(float f3) {
        return this.f11272i.g0(f3);
    }

    @Override // r0.InterfaceC1126o
    public final O0.k getLayoutDirection() {
        return this.f11272i.getLayoutDirection();
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f11272i.l(f3);
    }

    @Override // O0.b
    public final int m0(long j3) {
        return this.f11272i.m0(j3);
    }

    @Override // O0.b
    public final float o0(int i2) {
        return this.f11272i.o0(i2);
    }

    @Override // O0.b
    public final float p0(long j3) {
        return this.f11272i.p0(j3);
    }

    @Override // O0.b
    public final float r0(float f3) {
        return this.f11272i.r0(f3);
    }

    @Override // O0.b
    public final float s() {
        return this.f11272i.s();
    }
}
