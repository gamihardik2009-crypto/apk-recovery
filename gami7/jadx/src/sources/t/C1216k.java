package t;

import B1.C;
import java.util.List;
import v.C1329A;
import v.InterfaceC1331C;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216k implements InterfaceC1331C {

    /* renamed from: a, reason: collision with root package name */
    public final C1214i f10259a;

    /* renamed from: b, reason: collision with root package name */
    public final C1329A f10260b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1329A f10263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V.e f10266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.f f10267i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f10268j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10269k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10270l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f10271m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1228w f10272n;

    public C1216k(long j3, boolean z3, C1214i c1214i, C1329A c1329a, int i2, int i3, V.e eVar, V.f fVar, boolean z4, int i4, int i5, long j4, C1228w c1228w) {
        this.f10262d = z3;
        this.f10263e = c1329a;
        this.f10264f = i2;
        this.f10265g = i3;
        this.f10266h = eVar;
        this.f10267i = fVar;
        this.f10268j = z4;
        this.f10269k = i4;
        this.f10270l = i5;
        this.f10271m = j4;
        this.f10272n = c1228w;
        this.f10259a = c1214i;
        this.f10260b = c1329a;
        this.f10261c = C.c(z3 ? O0.a.h(j3) : Integer.MAX_VALUE, z3 ? Integer.MAX_VALUE : O0.a.g(j3), 5);
    }

    public final C1220o a(long j3, int i2) {
        C1214i c1214i = this.f10259a;
        Object b3 = c1214i.b(i2);
        Object n3 = c1214i.f10241b.n(i2);
        List a3 = this.f10260b.a(j3, i2);
        int i3 = i2 == this.f10264f + (-1) ? 0 : this.f10265g;
        return new C1220o(i2, a3, this.f10262d, this.f10266h, this.f10267i, this.f10263e.f11272i.getLayoutDirection(), this.f10268j, this.f10269k, this.f10270l, i3, this.f10271m, b3, n3, this.f10272n.f10356n, j3);
    }
}
