package c0;

import android.graphics.ColorSpace;
import d0.AbstractC0632c;
import d0.C0633d;
import d0.C0645p;
import d0.C0646q;
import d0.C0647r;
import d0.C0648s;
import d0.InterfaceC0638i;
import java.util.function.DoubleUnaryOperator;

/* renamed from: c0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0606y {
    public static final ColorSpace a(AbstractC0632c abstractC0632c) {
        C0646q c0646q;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb rgb;
        if (z2.h.a(abstractC0632c, C0633d.f7401c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7413o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7414p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7411m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7406h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7405g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7415r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (z2.h.a(abstractC0632c, C0633d.q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7407i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7408j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7403e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7404f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7402d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7409k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7412n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (z2.h.a(abstractC0632c, C0633d.f7410l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC0632c instanceof C0646q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        C0646q c0646q2 = (C0646q) abstractC0632c;
        float[] a3 = c0646q2.f7446d.a();
        C0647r c0647r = c0646q2.f7449g;
        if (c0647r != null) {
            c0646q = c0646q2;
            transferParameters = new ColorSpace.Rgb.TransferParameters(c0647r.f7460b, c0647r.f7461c, c0647r.f7462d, c0647r.f7463e, c0647r.f7464f, c0647r.f7465g, c0647r.f7459a);
        } else {
            c0646q = c0646q2;
            transferParameters = null;
        }
        if (transferParameters != null) {
            rgb = new ColorSpace.Rgb(abstractC0632c.f7396a, c0646q.f7450h, a3, transferParameters);
        } else {
            C0646q c0646q3 = c0646q;
            String str = abstractC0632c.f7396a;
            final C0645p c0645p = c0646q3.f7454l;
            final int i2 = 0;
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator(c0645p, i2) { // from class: c0.w

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f7280a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ y2.c f7281b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f7280a = i2;
                    this.f7281b = (y2.c) c0645p;
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d3) {
                    switch (this.f7280a) {
                        case 0:
                            return ((Number) this.f7281b.l(Double.valueOf(d3))).doubleValue();
                        default:
                            return ((Number) this.f7281b.l(Double.valueOf(d3))).doubleValue();
                    }
                }
            };
            final C0645p c0645p2 = c0646q3.f7457o;
            final int i3 = 1;
            C0646q c0646q4 = (C0646q) abstractC0632c;
            rgb = new ColorSpace.Rgb(str, c0646q3.f7450h, a3, doubleUnaryOperator, new DoubleUnaryOperator(c0645p2, i3) { // from class: c0.w

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f7280a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ y2.c f7281b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f7280a = i3;
                    this.f7281b = (y2.c) c0645p2;
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d3) {
                    switch (this.f7280a) {
                        case 0:
                            return ((Number) this.f7281b.l(Double.valueOf(d3))).doubleValue();
                        default:
                            return ((Number) this.f7281b.l(Double.valueOf(d3))).doubleValue();
                    }
                }
            }, c0646q4.f7447e, c0646q4.f7448f);
        }
        return rgb;
    }

    public static final AbstractC0632c b(final ColorSpace colorSpace) {
        C0648s c0648s;
        C0648s c0648s2;
        C0647r c0647r;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return C0633d.f7401c;
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return C0633d.f7413o;
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return C0633d.f7414p;
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C0633d.f7411m;
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return C0633d.f7406h;
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return C0633d.f7405g;
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C0633d.f7415r;
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C0633d.q;
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return C0633d.f7407i;
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C0633d.f7408j;
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C0633d.f7403e;
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C0633d.f7404f;
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C0633d.f7402d;
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C0633d.f7409k;
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C0633d.f7412n;
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C0633d.f7410l;
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return C0633d.f7401c;
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        if (rgb.getWhitePoint().length == 3) {
            float f3 = rgb.getWhitePoint()[0];
            float f4 = rgb.getWhitePoint()[1];
            float f5 = f3 + f4 + rgb.getWhitePoint()[2];
            c0648s = new C0648s(f3 / f5, f4 / f5);
        } else {
            c0648s = new C0648s(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        }
        C0648s c0648s3 = c0648s;
        if (transferParameters != null) {
            c0648s2 = c0648s3;
            c0647r = new C0647r(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            c0648s2 = c0648s3;
            c0647r = null;
        }
        String name = rgb.getName();
        float[] primaries = rgb.getPrimaries();
        float[] transform = rgb.getTransform();
        final int i2 = 0;
        InterfaceC0638i interfaceC0638i = new InterfaceC0638i() { // from class: c0.x
            @Override // d0.InterfaceC0638i
            public final double c(double d3) {
                switch (i2) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d3);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d3);
                }
            }
        };
        final int i3 = 1;
        return new C0646q(name, primaries, c0648s2, transform, interfaceC0638i, new InterfaceC0638i() { // from class: c0.x
            @Override // d0.InterfaceC0638i
            public final double c(double d3) {
                switch (i3) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d3);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d3);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), c0647r, rgb.getId());
    }
}
