package org.panda_lang.panda.composition;

import org.panda_lang.core.interpreter.parser.ParserPipeline;
import org.panda_lang.core.interpreter.parser.ParserRepresentation;
import org.panda_lang.panda.composition.parser.MethodParser;
import org.panda_lang.panda.implementation.interpreter.parser.PandaParserPipeline;
import org.panda_lang.panda.implementation.interpreter.parser.PandaParserRepresentation;

public class ParserComposition {

    private final ParserPipeline pipeline;

    public ParserComposition() {
        this.pipeline = new PandaParserPipeline();

        this.initialize();
    }

    protected void initialize() {
        ParserRepresentation methodParserRepresentation = new PandaParserRepresentation(new MethodParser(), new MethodParser.MethodParserHandler());
        pipeline.registerParserRepresentation(methodParserRepresentation);
    }

    public ParserPipeline getPipeline() {
        return pipeline;
    }

}
