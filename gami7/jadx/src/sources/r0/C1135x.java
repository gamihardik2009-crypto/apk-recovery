package r0;

import java.util.Map;
import t0.C1261t;

/* renamed from: r0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135x implements InterfaceC1095I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f9899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.c f9900d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1136y f9901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1090D f9902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.c f9903g;

    public C1135x(int i2, int i3, Map map, C1136y c1136y, C1090D c1090d, y2.c cVar) {
        this.f9897a = i2;
        this.f9898b = i3;
        this.f9899c = map;
        this.f9901e = c1136y;
        this.f9902f = c1090d;
        this.f9903g = cVar;
    }

    @Override // r0.InterfaceC1095I
    public final int f() {
        return this.f9897a;
    }

    @Override // r0.InterfaceC1095I
    public final int h() {
        return this.f9898b;
    }

    @Override // r0.InterfaceC1095I
    public final Map i() {
        return this.f9899c;
    }

    @Override // r0.InterfaceC1095I
    public final void j() {
        t0.O o3;
        boolean F = this.f9901e.F();
        y2.c cVar = this.f9903g;
        C1090D c1090d = this.f9902f;
        if (!F || (o3 = ((C1261t) c1090d.f9808h.f10378C.f4241c).f10627T) == null) {
            cVar.l(((C1261t) c1090d.f9808h.f10378C.f4241c).f10488p);
        } else {
            cVar.l(o3.f10488p);
        }
    }

    @Override // r0.InterfaceC1095I
    public final y2.c k() {
        return this.f9900d;
    }
}
