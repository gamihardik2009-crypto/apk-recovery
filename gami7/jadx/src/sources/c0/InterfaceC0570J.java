package c0;

import android.graphics.Path;
import android.graphics.RectF;
import b0.AbstractC0503a;
import m.AbstractC0837j;

/* renamed from: c0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0570J {
    static void a(InterfaceC0570J interfaceC0570J, b0.d dVar) {
        Path.Direction direction;
        C0591j c0591j = (C0591j) interfaceC0570J;
        float f3 = dVar.f7060a;
        if (!Float.isNaN(f3)) {
            float f4 = dVar.f7061b;
            if (!Float.isNaN(f4)) {
                float f5 = dVar.f7062c;
                if (!Float.isNaN(f5)) {
                    float f6 = dVar.f7063d;
                    if (!Float.isNaN(f6)) {
                        if (c0591j.f7261b == null) {
                            c0591j.f7261b = new RectF();
                        }
                        RectF rectF = c0591j.f7261b;
                        z2.h.c(rectF);
                        rectF.set(f3, f4, f5, f6);
                        RectF rectF2 = c0591j.f7261b;
                        z2.h.c(rectF2);
                        int d3 = AbstractC0837j.d(1);
                        if (d3 == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (d3 != 1) {
                                throw new J2.r();
                            }
                            direction = Path.Direction.CW;
                        }
                        c0591j.f7260a.addRect(rectF2, direction);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    static void b(InterfaceC0570J interfaceC0570J, b0.e eVar) {
        Path.Direction direction;
        C0591j c0591j = (C0591j) interfaceC0570J;
        if (c0591j.f7261b == null) {
            c0591j.f7261b = new RectF();
        }
        RectF rectF = c0591j.f7261b;
        z2.h.c(rectF);
        rectF.set(eVar.f7064a, eVar.f7065b, eVar.f7066c, eVar.f7067d);
        if (c0591j.f7262c == null) {
            c0591j.f7262c = new float[8];
        }
        float[] fArr = c0591j.f7262c;
        z2.h.c(fArr);
        long j3 = eVar.f7068e;
        fArr[0] = AbstractC0503a.b(j3);
        fArr[1] = AbstractC0503a.c(j3);
        long j4 = eVar.f7069f;
        fArr[2] = AbstractC0503a.b(j4);
        fArr[3] = AbstractC0503a.c(j4);
        long j5 = eVar.f7070g;
        fArr[4] = AbstractC0503a.b(j5);
        fArr[5] = AbstractC0503a.c(j5);
        long j6 = eVar.f7071h;
        fArr[6] = AbstractC0503a.b(j6);
        fArr[7] = AbstractC0503a.c(j6);
        RectF rectF2 = c0591j.f7261b;
        z2.h.c(rectF2);
        float[] fArr2 = c0591j.f7262c;
        z2.h.c(fArr2);
        int d3 = AbstractC0837j.d(1);
        if (d3 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (d3 != 1) {
                throw new J2.r();
            }
            direction = Path.Direction.CW;
        }
        c0591j.f7260a.addRoundRect(rectF2, fArr2, direction);
    }
}
