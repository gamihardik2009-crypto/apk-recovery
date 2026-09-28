package H;

import android.graphics.Path;
import c0.C0591j;
import c0.C0592k;
import c0.C0603v;
import c0.InterfaceC0570J;
import e0.InterfaceC0654d;
import java.util.List;
import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1096J;
import s.AbstractC1177p;

/* loaded from: classes.dex */
public final class S extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1958i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1959j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1960k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1962m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1963n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1964o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        super(1);
        this.f1958i = i2;
        this.f1959j = obj;
        this.f1960k = obj2;
        this.f1961l = obj3;
        this.f1962m = obj4;
        this.f1963n = obj5;
        this.f1964o = obj6;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        Path path;
        S s3 = this;
        switch (s3.f1958i) {
            case 0:
                InterfaceC0654d interfaceC0654d = (InterfaceC0654d) obj;
                float floor = (float) Math.floor(interfaceC0654d.P(V.f2061c));
                long j3 = ((C0603v) ((J.W0) s3.f1959j).getValue()).f7279a;
                long j4 = ((C0603v) ((J.W0) s3.f1960k).getValue()).f7279a;
                float P2 = interfaceC0654d.P(V.f2062d);
                float f3 = floor / 2.0f;
                e0.h hVar = new e0.h(floor, 0.0f, 0, 0, 30);
                float d3 = b0.f.d(interfaceC0654d.e());
                boolean c3 = C0603v.c(j3, j4);
                e0.g gVar = e0.g.f7556a;
                if (c3) {
                    InterfaceC0654d.S(interfaceC0654d, j3, 0L, B1.C.i(d3, d3), B2.a.d(P2, P2), gVar, 226);
                } else {
                    long e3 = K1.f.e(floor, floor);
                    float f4 = d3 - (2 * floor);
                    long i2 = B1.C.i(f4, f4);
                    float max = Math.max(0.0f, P2 - floor);
                    InterfaceC0654d.S(interfaceC0654d, j3, e3, i2, B2.a.d(max, max), gVar, 224);
                    float f5 = d3 - floor;
                    float f6 = P2 - f3;
                    InterfaceC0654d.S(interfaceC0654d, j4, K1.f.e(f3, f3), B1.C.i(f5, f5), B2.a.d(f6, f6), hVar, 224);
                    s3 = this;
                }
                long j5 = ((C0603v) ((J.W0) s3.f1961l).getValue()).f7279a;
                float floatValue = ((Number) ((J.W0) s3.f1962m).getValue()).floatValue();
                float floatValue2 = ((Number) ((J.W0) s3.f1963n).getValue()).floatValue();
                e0.h hVar2 = new e0.h(floor, 0.0f, 2, 0, 26);
                float d4 = b0.f.d(interfaceC0654d.e());
                float y3 = B2.a.y(0.4f, 0.5f, floatValue2);
                float y4 = B2.a.y(0.7f, 0.5f, floatValue2);
                float y5 = B2.a.y(0.5f, 0.5f, floatValue2);
                float y6 = B2.a.y(0.3f, 0.5f, floatValue2);
                N n3 = (N) s3.f1964o;
                ((C0591j) n3.f1761a).e();
                InterfaceC0570J interfaceC0570J = n3.f1761a;
                C0591j c0591j = (C0591j) interfaceC0570J;
                c0591j.f7260a.moveTo(0.2f * d4, y5 * d4);
                Path path2 = c0591j.f7260a;
                path2.lineTo(y3 * d4, y4 * d4);
                path2.lineTo(0.8f * d4, d4 * y6);
                C0592k c0592k = n3.f1762b;
                if (interfaceC0570J != null) {
                    c0592k.getClass();
                    if (!(interfaceC0570J instanceof C0591j)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    path = ((C0591j) interfaceC0570J).f7260a;
                } else {
                    path = null;
                }
                c0592k.f7263a.setPath(path, false);
                InterfaceC0570J interfaceC0570J2 = n3.f1763c;
                ((C0591j) interfaceC0570J2).e();
                c0592k.a(0.0f, c0592k.f7263a.getLength() * floatValue, interfaceC0570J2);
                interfaceC0654d.X(n3.f1763c, j5, 1.0f, hVar2, null, 3);
                return C0880v.f8657a;
            default:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                AbstractC1103Q[] abstractC1103QArr = (AbstractC1103Q[]) s3.f1959j;
                int length = abstractC1103QArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i4 < length) {
                    AbstractC1103Q abstractC1103Q = abstractC1103QArr[i4];
                    z2.h.d(abstractC1103Q, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC1177p.b(abstractC1102P, abstractC1103Q, (InterfaceC1093G) ((List) s3.f1960k).get(i3), ((InterfaceC1096J) s3.f1961l).getLayoutDirection(), ((z2.q) s3.f1962m).f11907h, ((z2.q) s3.f1963n).f11907h, ((s.r) s3.f1964o).f10175a);
                    i4++;
                    i3++;
                }
                return C0880v.f8657a;
        }
    }
}
