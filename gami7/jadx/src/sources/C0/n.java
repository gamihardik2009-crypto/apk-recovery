package C0;

import android.text.Layout;
import c0.C0588g;
import c0.C0594m;
import e0.C0652b;
import e0.InterfaceC0654d;
import java.io.Serializable;
import m2.C0880v;
import t0.C1238G;

/* loaded from: classes.dex */
public final class n extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f518i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f519j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f520k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f521l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f522m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j3, float[] fArr, z2.q qVar, z2.p pVar) {
        super(1);
        this.f519j = j3;
        this.f520k = fArr;
        this.f521l = qVar;
        this.f522m = pVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        D0.D d3;
        boolean z3;
        boolean z4;
        float a3;
        float a4;
        switch (this.f518i) {
            case 0:
                q qVar = (q) obj;
                int i2 = qVar.f534b;
                long j3 = this.f519j;
                int e3 = i2 > J.e(j3) ? qVar.f534b : J.e(j3);
                int d4 = J.d(j3);
                int i3 = qVar.f535c;
                if (i3 >= d4) {
                    i3 = J.d(j3);
                }
                long j4 = B1.C.j(qVar.b(e3), qVar.b(i3));
                z2.q qVar2 = (z2.q) this.f521l;
                int i4 = qVar2.f11907h;
                C0019b c0019b = qVar.f533a;
                c0019b.getClass();
                int e4 = J.e(j4);
                int d5 = J.d(j4);
                D0.D d6 = c0019b.f485d;
                Layout layout = d6.f949f;
                int length = layout.getText().length();
                if (e4 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0".toString());
                }
                if (e4 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length".toString());
                }
                if (d5 <= e4) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
                if (d5 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                }
                int i5 = (d5 - e4) * 4;
                float[] fArr = (float[]) this.f520k;
                if (fArr.length - i4 < i5) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                }
                int lineForOffset = layout.getLineForOffset(e4);
                int lineForOffset2 = layout.getLineForOffset(d5 - 1);
                D0.n nVar = new D0.n(d6);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f3 = d6.f(lineForOffset);
                        int max = Math.max(e4, lineStart);
                        int min = Math.min(d5, f3);
                        float g3 = d6.g(lineForOffset);
                        float e5 = d6.e(lineForOffset);
                        int i6 = i4;
                        int i7 = e4;
                        int i8 = d5;
                        boolean z5 = false;
                        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean z7 = !z6;
                        int i9 = max;
                        int i10 = i6;
                        while (i9 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i9);
                            if (!z6 || isRtlCharAt) {
                                d3 = d6;
                                if (z6 && isRtlCharAt) {
                                    float a5 = nVar.a(i9, false, false, false);
                                    z3 = z6;
                                    a3 = nVar.a(i9 + 1, true, true, false);
                                    z4 = false;
                                    a4 = a5;
                                } else {
                                    z3 = z6;
                                    if (z7 && isRtlCharAt) {
                                        float a6 = nVar.a(i9, false, false, true);
                                        a3 = nVar.a(i9 + 1, true, true, true);
                                        a4 = a6;
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                        a3 = nVar.a(i9, false, false, false);
                                        a4 = nVar.a(i9 + 1, true, true, false);
                                    }
                                }
                            } else {
                                d3 = d6;
                                a3 = nVar.a(i9, z5, z5, true);
                                a4 = nVar.a(i9 + 1, true, true, true);
                                z3 = z6;
                                z4 = false;
                            }
                            fArr[i10] = a3;
                            fArr[i10 + 1] = g3;
                            fArr[i10 + 2] = a4;
                            fArr[i10 + 3] = e5;
                            i10 += 4;
                            i9++;
                            z5 = z4;
                            d6 = d3;
                            z6 = z3;
                        }
                        D0.D d7 = d6;
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i4 = i10;
                            e4 = i7;
                            d5 = i8;
                            d6 = d7;
                        }
                    }
                }
                int c3 = (J.c(j4) * 4) + qVar2.f11907h;
                int i11 = qVar2.f11907h;
                while (true) {
                    z2.p pVar = (z2.p) this.f522m;
                    if (i11 >= c3) {
                        qVar2.f11907h = c3;
                        pVar.f11906h = c0019b.b() + pVar.f11906h;
                        return C0880v.f8657a;
                    }
                    int i12 = i11 + 1;
                    float f4 = fArr[i12];
                    float f5 = pVar.f11906h;
                    fArr[i12] = f4 + f5;
                    int i13 = i11 + 3;
                    fArr[i13] = fArr[i13] + f5;
                    i11 += 4;
                }
            default:
                C1238G c1238g = (C1238G) obj;
                c1238g.a();
                b0.d dVar = (b0.d) this.f520k;
                float f6 = dVar.f7060a;
                z2.s sVar = (z2.s) this.f521l;
                long j5 = this.f519j;
                C0594m c0594m = (C0594m) this.f522m;
                C0652b c0652b = c1238g.f10415h;
                B.F f7 = (B.F) c0652b.f7552i.f4558a;
                float f8 = dVar.f7061b;
                f7.H(f6, f8);
                try {
                    InterfaceC0654d.q(c1238g, (C0588g) sVar.f11909h, j5, 0.0f, c0594m, 890);
                    ((B.F) c0652b.f7552i.f4558a).H(-f6, -f8);
                    return C0880v.f8657a;
                } catch (Throwable th) {
                    ((B.F) c0652b.f7552i.f4558a).H(-f6, -f8);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0.d dVar, z2.s sVar, long j3, C0594m c0594m) {
        super(1);
        this.f520k = dVar;
        this.f521l = sVar;
        this.f519j = j3;
        this.f522m = c0594m;
    }
}
