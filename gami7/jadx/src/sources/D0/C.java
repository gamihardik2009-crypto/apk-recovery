package D0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* loaded from: classes.dex */
public final class C extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f943a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        f fVar = f.f965a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return fVar.a(canvas, path);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        f fVar = f.f965a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return fVar.e(canvas, rectF);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.a(canvas);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawARGB(i2, i3, i4, i5);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f3, float f4, boolean z3, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawArc(rectF, f3, f4, z3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i2, int i3, float[] fArr, int i4, int[] iArr, int i5, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i2, i3, fArr, i4, iArr, i5, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawCircle(f3, f4, f5, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawColor(i2);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f3, float f4, RectF rectF2, float f5, float f6, Paint paint) {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.e(canvas, rectF, f3, f4, rectF2, f5, f6, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i2, float[] fArr, int i3, int i4, Font font, Paint paint) {
        l lVar = l.f968a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            lVar.a(canvas, iArr, i2, fArr, i3, i4, font, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawLine(f3, f4, f5, f6, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawLines(fArr, i2, i3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        l lVar = l.f968a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            lVar.b(canvas, ninePatch, rect, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPoint(f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i2, i3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i2, int i3, float[] fArr, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i2, i3, fArr, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i2, int i3, int i4) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawRGB(i2, i3, i4);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.g(canvas, renderNode);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i2, int i3, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawText(cArr, i2, i3, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i2, int i3, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i2, i3, path, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i2, int i3, int i4, int i5, float f3, float f4, boolean z3, Paint paint) {
        C0061e c0061e = C0061e.f964a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            c0061e.b(canvas, cArr, i2, i3, i4, i5, f3, f4, z3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i2, float[] fArr, int i3, float[] fArr2, int i4, int[] iArr, int i5, short[] sArr, int i6, int i7, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i2, fArr, i3, fArr2, i4, iArr, i5, sArr, i6, i7, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.i(canvas);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f943a;
        if (canvas == null) {
            z2.h.j("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.restore();
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i2) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.restoreToCount(i2);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f3) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.rotate(f3);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.save();
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i2) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i2);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2, int i3) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i2, i3);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f3, float f4) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.scale(f3, f4);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i2) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.setDensity(i2);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f3, float f4) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.skew(f3, f4);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f3, float f4) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.translate(f3, f4);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        f fVar = f.f965a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return fVar.d(canvas, rect);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f3, float f4, float f5, float f6, float f7, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawArc(f3, f4, f5, f6, f7, f8, z3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3) {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.c(canvas, j3);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawOval(f3, f4, f5, f6, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        l lVar = l.f968a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            lVar.c(canvas, ninePatch, rectF, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawRoundRect(f3, f4, f5, f6, f7, f8, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawText(str, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        j jVar = j.f967a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return jVar.c(canvas, rectF);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i2);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f3, float f4, float f5, float f6) {
        f fVar = f.f965a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return fVar.b(canvas, f3, f4, f5, f6);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, PorterDuff.Mode mode) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawColor(i2, mode);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawRect(f3, f4, f5, f6, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i2, int i3, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawText(str, i2, i3, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint, int i2) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint, i2);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i2, int i3) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i2, i3);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i2, int i3, int i4, int i5) {
        f fVar = f.f965a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return fVar.c(canvas, i2, i3, i4, i5);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i3, float f3, float f4, int i4, int i5, boolean z3, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i3, f3, f4, i4, i5, z3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, BlendMode blendMode) {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.b(canvas, i2, blendMode);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i2, int i3, float f3, float f4, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawText(charSequence, i2, i3, f3, f4, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        j jVar = j.f967a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return jVar.b(canvas, path);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i2) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i2);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6, Region.Op op) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6, op);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z3, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i3, i4, i5, i6, i7, z3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3, BlendMode blendMode) {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.d(canvas, j3, blendMode);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i2, int i3, int i4, int i5, float f3, float f4, boolean z3, Paint paint) {
        C0061e c0061e = C0061e.f964a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            c0061e.a(canvas, charSequence, i2, i3, i4, i5, f3, f4, z3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.quickReject(f3, f4, f5, f6, edgeType);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6) {
        j jVar = j.f967a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return jVar.a(canvas, f3, f4, f5, f6);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.f943a;
        if (canvas != null) {
            return canvas.clipRect(i2, i3, i4, i5);
        }
        z2.h.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i2, int i3, int i4, int i5, float f3, float f4, boolean z3, Paint paint) {
        h hVar = h.f966a;
        Canvas canvas = this.f943a;
        if (canvas != null) {
            hVar.h(canvas, measuredText, i2, i3, i4, i5, f3, f4, z3, paint);
        } else {
            z2.h.j("nativeCanvas");
            throw null;
        }
    }
}
